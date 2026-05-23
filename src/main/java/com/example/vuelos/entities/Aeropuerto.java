package com.example.vuelos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "aeropuerto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aeropuerto extends Base {

    @Column(nullable = false)
    private String nombreAeropuerto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;
}
