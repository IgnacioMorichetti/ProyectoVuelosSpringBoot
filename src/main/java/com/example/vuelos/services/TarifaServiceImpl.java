package com.example.vuelos.services;

import com.example.vuelos.entities.Tarifa;
import com.example.vuelos.repositories.BaseRepository;
import com.example.vuelos.repositories.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarifaServiceImpl extends BaseServiceImpl<Tarifa, Long> implements TarifaService {

    @Autowired
    private TarifaRepository tarifaRepository;

    public TarifaServiceImpl(BaseRepository<Tarifa, Long> baseRepository) {
        super(baseRepository);
    }
}
