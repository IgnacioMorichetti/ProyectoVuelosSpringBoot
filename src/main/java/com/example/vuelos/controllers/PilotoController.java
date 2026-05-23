package com.example.vuelos.controllers;

import com.example.vuelos.entities.Piloto;
import com.example.vuelos.services.PilotoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/pilotos")
public class PilotoController extends BaseControllerImpl<Piloto, Long, PilotoService> {

    public PilotoController(PilotoService servicio) {
        super(servicio);
    }
}
