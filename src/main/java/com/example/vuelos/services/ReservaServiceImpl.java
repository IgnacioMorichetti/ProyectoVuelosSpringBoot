package com.example.vuelos.services;

import com.example.vuelos.entities.Reserva;
import com.example.vuelos.repositories.BaseRepository;
import com.example.vuelos.repositories.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl extends BaseServiceImpl<Reserva, Long> implements ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaServiceImpl(ReservaRepository reservaRepository) {
        super(reservaRepository);
        this.reservaRepository = reservaRepository;
    }

    @Override
    public List<Reserva> findByDni(int dni) {
        return reservaRepository.findByUsuario_DniPersona(dni);
    }
}
