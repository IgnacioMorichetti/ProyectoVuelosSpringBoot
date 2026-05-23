package com.example.vuelos.services;

import com.example.vuelos.entities.Ciudad;
import com.example.vuelos.repositories.BaseRepository;
import com.example.vuelos.repositories.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImpl extends BaseServiceImpl<Ciudad, Long> implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    public CiudadServiceImpl(BaseRepository<Ciudad, Long> baseRepository) {
        super(baseRepository);
    }
}
