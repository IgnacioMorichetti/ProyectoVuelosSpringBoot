package com.example.vuelos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "aerolinea")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aerolinea extends Base {

    @Column(nullable = false)
    private String nombreAerolinea;
}
