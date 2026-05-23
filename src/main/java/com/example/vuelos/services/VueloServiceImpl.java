package com.example.vuelos.services;

import com.example.vuelos.entities.Vuelo;
import com.example.vuelos.repositories.BaseRepository;
import com.example.vuelos.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueloServiceImpl extends BaseServiceImpl<Vuelo, Long> implements VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    public VueloServiceImpl(BaseRepository<Vuelo, Long> baseRepository) {
        super(baseRepository);
    }
}
