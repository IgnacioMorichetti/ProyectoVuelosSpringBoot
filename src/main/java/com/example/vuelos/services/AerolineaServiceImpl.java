package com.example.vuelos.services;

import com.example.vuelos.entities.Aerolinea;
import com.example.vuelos.repositories.AerolineaRepository;
import com.example.vuelos.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AerolineaServiceImpl extends BaseServiceImpl<Aerolinea, Long> implements AerolineaService {

    @Autowired
    private AerolineaRepository aerolineaRepository;

    public AerolineaServiceImpl(BaseRepository<Aerolinea, Long> baseRepository) {
        super(baseRepository);
    }
}
