package com.example.vuelos.services;

import com.example.vuelos.entities.Consulta;
import com.example.vuelos.repositories.BaseRepository;
import com.example.vuelos.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServiceImpl extends BaseServiceImpl<Consulta, Long> implements ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public ConsultaServiceImpl(BaseRepository<Consulta, Long> baseRepository) {
        super(baseRepository);
    }
}
