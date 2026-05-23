package com.example.vuelos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Persona extends Base {

    @Column(nullable = false)
    protected int dniPersona;

    @Column(nullable = false)
    protected String nombrePersona;

    @Column(nullable = false)
    protected String apellidoPersona;
}
