package com.example.vuelos.controllers;

import com.example.vuelos.entities.Usuario;
import com.example.vuelos.services.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, Long, UsuarioService> {

    public UsuarioController(UsuarioService servicio) {
        super(servicio);
    }
}
