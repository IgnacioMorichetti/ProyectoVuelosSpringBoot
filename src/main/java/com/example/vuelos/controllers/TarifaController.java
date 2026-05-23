package com.example.vuelos.controllers;

import com.example.vuelos.entities.Tarifa;
import com.example.vuelos.services.TarifaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/tarifas")
public class TarifaController extends BaseControllerImpl<Tarifa, Long, TarifaService> {

    public TarifaController(TarifaService servicio) {
        super(servicio);
    }
}
