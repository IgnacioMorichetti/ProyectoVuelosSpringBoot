package com.example.vuelos.repositories;

import com.example.vuelos.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
}
