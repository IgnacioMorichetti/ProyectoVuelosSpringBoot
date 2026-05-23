package com.example.vuelos.services;

import com.example.vuelos.entities.Reserva;
import com.example.vuelos.repositories.BaseRepository;
import com.example.vuelos.repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl extends BaseServiceImpl<Reserva, Long> implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public ReservaServiceImpl(BaseRepository<Reserva, Long> baseRepository) {
        super(baseRepository);
    }
}
