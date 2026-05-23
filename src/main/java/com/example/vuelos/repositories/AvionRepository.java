package com.example.vuelos.repositories;

import com.example.vuelos.entities.Avion;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends BaseRepository<Avion, Long> {
}
