package com.example.vuelos.controllers;

import com.example.vuelos.entities.Aerolinea;
import com.example.vuelos.services.AerolineaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/aerolineas")
public class AerolineaController extends BaseControllerImpl<Aerolinea, Long, AerolineaService> {

    public AerolineaController(AerolineaService servicio) {
        super(servicio);
    }
}
