package com.example.vuelos.repositories;

import com.example.vuelos.entities.Reserva;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends BaseRepository<Reserva, Long> {

    List<Reserva> findByUsuario_DniPersona(int dniPersona);
}
