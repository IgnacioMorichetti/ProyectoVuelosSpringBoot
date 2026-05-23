package com.example.vuelos.repositories;

import com.example.vuelos.entities.Reserva;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends BaseRepository<Reserva, Long> {
}
