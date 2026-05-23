package com.example.vuelos.controllers;

import com.example.vuelos.entities.Asiento;
import com.example.vuelos.services.AsientoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/asientos")
public class AsientoController extends BaseControllerImpl<Asiento, Long, AsientoService> {

    public AsientoController(AsientoService servicio) {
        super(servicio);
    }
}
