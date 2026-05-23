package com.example.vuelos.controllers;

import com.example.vuelos.entities.Avion;
import com.example.vuelos.services.AvionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/aviones")
public class AvionController extends BaseControllerImpl<Avion, Long, AvionService> {

    public AvionController(AvionService servicio) {
        super(servicio);
    }
}
