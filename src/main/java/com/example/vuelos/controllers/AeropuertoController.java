package com.example.vuelos.controllers;

import com.example.vuelos.entities.Aeropuerto;
import com.example.vuelos.services.AeropuertoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/aeropuertos")
public class AeropuertoController extends BaseControllerImpl<Aeropuerto, Long, AeropuertoService> {

    public AeropuertoController(AeropuertoService servicio) {
        super(servicio);
    }
}
