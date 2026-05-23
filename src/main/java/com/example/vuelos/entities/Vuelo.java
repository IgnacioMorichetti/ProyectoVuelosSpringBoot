package com.example.vuelos.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vuelo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vuelo extends Base {

    @Column(nullable = false)
    private int numeroVuelo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "avion_id")
    private Avion avion;

    // tabla intermedia vuelo_aeropuerto para la relacion N:N con Aeropuerto
    @ManyToMany
    @JoinTable(
            name = "vuelo_aeropuerto",
            joinColumns = @JoinColumn(name = "vuelo_id"),
            inverseJoinColumns = @JoinColumn(name = "aeropuerto_id")
    )
    private List<Aeropuerto> aeropuertos = new ArrayList<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "aerolinea_id")
    private Aerolinea aerolinea;

    @ManyToOne(optional = false)
    @JoinColumn(name = "piloto_id")
    private Piloto piloto;

    private LocalDate fecha;

    @ManyToOne(optional = false)
    @JoinColumn(name = "destino_id")
    private Ciudad destino;

    @OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Tarifa> tarifas = new ArrayList<>();
}
