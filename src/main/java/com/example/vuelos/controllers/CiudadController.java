package com.example.vuelos.controllers;

import com.example.vuelos.entities.Ciudad;
import com.example.vuelos.services.CiudadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/ciudades")
public class CiudadController extends BaseControllerImpl<Ciudad, Long, CiudadService> {

    public CiudadController(CiudadService servicio) {
        super(servicio);
    }
}
