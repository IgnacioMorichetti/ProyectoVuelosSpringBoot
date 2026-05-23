package com.example.vuelos.repositories;

import com.example.vuelos.entities.Vuelo;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends BaseRepository<Vuelo, Long> {
}
