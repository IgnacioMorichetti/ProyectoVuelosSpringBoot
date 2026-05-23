package com.example.vuelos.controllers;

import com.example.vuelos.entities.Consulta;
import com.example.vuelos.services.ConsultaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/consultas")
public class ConsultaController extends BaseControllerImpl<Consulta, Long, ConsultaService> {

    public ConsultaController(ConsultaService servicio) {
        super(servicio);
    }
}
