package com.example.vuelos.controllers;

import com.example.vuelos.entities.Vuelo;
import com.example.vuelos.services.VueloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/vuelos")
public class VueloController extends BaseControllerImpl<Vuelo, Long, VueloService> {

    public VueloController(VueloService servicio) {
        super(servicio);
    }
}
