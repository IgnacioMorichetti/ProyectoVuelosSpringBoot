const API = 'http://localhost:8080/api/v1';

function seleccionarDestino(destino) {
    document.getElementById('destino').value = destino;
    document.getElementById('reservar').scrollIntoView({ behavior: 'smooth' });
}

document.getElementById('reservaForm').addEventListener('submit', async function (e) {
    e.preventDefault();
    const resultadosEl = document.getElementById('resultados');
    resultadosEl.innerHTML = '<p class="mensaje mensaje-vacio">Buscando vuelos disponibles...</p>';

    const destino = document.getElementById('destino').value;
    const fecha   = document.getElementById('fecha').value;

    try {
        const res = await fetch(`${API}/vuelos`);
        if (!res.ok) throw new Error('Error al conectar con el servidor.');

        const vuelos = await res.json();
        const filtrados = vuelos.filter(v =>
            v.destino && v.destino.nombreCiudad === destino
        );

        if (filtrados.length === 0) {
            resultadosEl.innerHTML = `
                <p class="mensaje mensaje-vacio">
                    No hay vuelos disponibles hacia <strong>${destino}</strong> para la fecha seleccionada.
                </p>`;
            return;
        }

        mostrarVuelos(filtrados, fecha);

    } catch (error) {
        resultadosEl.innerHTML = `
            <p class="mensaje mensaje-error">
                No se pudo conectar con el servidor. Verificá que la aplicación esté corriendo en el puerto 8080.
            </p>`;
    }
});

function mostrarVuelos(vuelos, fecha) {
    const resultadosEl = document.getElementById('resultados');
    const cards = vuelos.map(v => `
        <div class="vuelo-card">
            <div class="vuelo-info">
                <h4>Vuelo N° ${v.numeroVuelo} &mdash; ${v.destino.nombreCiudad}</h4>
                <p>
                    Fecha: ${v.fecha || fecha}
                    &nbsp;|&nbsp;
                    Aerolínea: ${v.aerolinea?.nombreAerolinea || '—'}
                    &nbsp;|&nbsp;
                    Piloto: ${v.piloto?.nombrePersona || '—'} ${v.piloto?.apellidoPersona || ''}
                </p>
            </div>
            <button class="btn-reservar" onclick="confirmarReserva(${v.id})">Reservar</button>
        </div>
    `).join('');

    resultadosEl.innerHTML = `<h3 class="resultado-titulo">Vuelos disponibles</h3>${cards}`;
}

async function confirmarReserva(vueloId) {
    const resultadosEl = document.getElementById('resultados');

    const usuario = {
        nombrePersona:            document.getElementById('nombre').value,
        apellidoPersona:          document.getElementById('apellido').value,
        dniPersona:               parseInt(document.getElementById('dni').value),
        correoElectronicoUsuario: document.getElementById('email').value,
        contraseniaUsuario:       'default123'
    };

    try {
        const usuarioRes = await fetch(`${API}/usuarios`, {
            method:  'POST',
            headers: { 'Content-Type': 'application/json' },
            body:    JSON.stringify(usuario)
        });
        if (!usuarioRes.ok) throw new Error('Error al registrar el usuario.');
        const usuarioCreado = await usuarioRes.json();

        const reserva = {
            numeroReserva: Math.floor(Math.random() * 90000) + 10000,
            asiento:       'A',
            clase:         document.getElementById('clase').value,
            precioFinal:   0,
            fechaReserva:  new Date().toISOString().split('T')[0],
            usuario:       { id: usuarioCreado.id },
            vuelo:         { id: vueloId }
        };

        const reservaRes = await fetch(`${API}/reservas`, {
            method:  'POST',
            headers: { 'Content-Type': 'application/json' },
            body:    JSON.stringify(reserva)
        });
        if (!reservaRes.ok) throw new Error('Error al crear la reserva.');

        resultadosEl.innerHTML = `
            <p class="mensaje mensaje-exito">
                ¡Reserva confirmada, ${usuario.nombrePersona}!
                Tu vuelo ha sido reservado exitosamente. Número de reserva: <strong>${reserva.numeroReserva}</strong>.
            </p>`;

    } catch (error) {
        resultadosEl.innerHTML = `<p class="mensaje mensaje-error">${error.message}</p>`;
    }
}
