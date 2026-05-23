package com.example.vuelos.services;

import com.example.vuelos.entities.Reserva;

import java.util.List;

public interface ReservaService extends BaseService<Reserva, Long> {

    List<Reserva> findByDni(int dni);
}
