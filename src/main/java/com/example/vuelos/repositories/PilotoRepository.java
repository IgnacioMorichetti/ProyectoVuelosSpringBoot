package com.example.vuelos.repositories;

import com.example.vuelos.entities.Piloto;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotoRepository extends BaseRepository<Piloto, Long> {
}
