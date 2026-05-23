package com.example.vuelos.services;

import com.example.vuelos.entities.Asiento;
import com.example.vuelos.repositories.AsientoRepository;
import com.example.vuelos.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsientoServiceImpl extends BaseServiceImpl<Asiento, Long> implements AsientoService {

    @Autowired
    private AsientoRepository asientoRepository;

    public AsientoServiceImpl(BaseRepository<Asiento, Long> baseRepository) {
        super(baseRepository);
    }
}
