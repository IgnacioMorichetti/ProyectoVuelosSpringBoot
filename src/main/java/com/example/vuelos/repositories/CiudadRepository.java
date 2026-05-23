package com.example.vuelos.repositories;

import com.example.vuelos.entities.Ciudad;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends BaseRepository<Ciudad, Long> {
}
