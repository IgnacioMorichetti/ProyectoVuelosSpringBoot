package com.example.vuelos.services;

import com.example.vuelos.entities.Aeropuerto;
import com.example.vuelos.repositories.AeropuertoRepository;
import com.example.vuelos.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AeropuertoServiceImpl extends BaseServiceImpl<Aeropuerto, Long> implements AeropuertoService {

    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    public AeropuertoServiceImpl(BaseRepository<Aeropuerto, Long> baseRepository) {
        super(baseRepository);
    }
}
