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
@Table(name = "asiento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Asiento extends Base {

    @Column(nullable = false)
    private int filaAsiento;

    @Column(nullable = false, length = 1)
    private String letraAsiento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Clase claseAsiento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "avion_id")
    private Avion avion;
}
