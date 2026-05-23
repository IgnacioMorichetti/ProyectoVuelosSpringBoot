package com.example.vuelos.controllers;

import com.example.vuelos.entities.Reserva;
import com.example.vuelos.services.ReservaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/reservas")
public class ReservaController extends BaseControllerImpl<Reserva, Long, ReservaService> {

    public ReservaController(ReservaService servicio) {
        super(servicio);
    }
}
