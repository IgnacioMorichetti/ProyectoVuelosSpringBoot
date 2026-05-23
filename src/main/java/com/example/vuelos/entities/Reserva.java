package com.example.vuelos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "reserva")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reserva extends Base {

    @Column(nullable = false)
    private int numeroReserva;

    @Column(nullable = false, length = 1)
    private String asiento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Clase clase;

    @Column(nullable = false)
    private int precioFinal;

    private LocalDate fechaReserva;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "vuelo_id")
    private Vuelo vuelo;
}
