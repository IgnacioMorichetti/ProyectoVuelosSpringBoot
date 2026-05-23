package com.example.vuelos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tarifa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tarifa extends Base {

    @Column(nullable = false)
    private int numeroTarifa;

    @Column(nullable = false)
    private int impuestoTarifa;

    @Column(nullable = false)
    private int precioTarifa;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Clase claseTarifa;

    @ManyToOne(optional = false)
    @JoinColumn(name = "vuelo_id")
    private Vuelo vuelo;
}
