package com.example.vuelos.services;

import com.example.vuelos.entities.Piloto;
import com.example.vuelos.repositories.BaseRepository;
import com.example.vuelos.repositories.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotoServiceImpl extends BaseServiceImpl<Piloto, Long> implements PilotoService {

    @Autowired
    private PilotoRepository pilotoRepository;

    public PilotoServiceImpl(BaseRepository<Piloto, Long> baseRepository) {
        super(baseRepository);
    }
}
