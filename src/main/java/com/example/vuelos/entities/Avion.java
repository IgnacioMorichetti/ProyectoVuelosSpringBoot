package com.example.vuelos.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "avion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Avion extends Base {

    @Column(nullable = false)
    private int numeroAvion;

    @OneToMany(mappedBy = "avion", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Asiento> asientos = new ArrayList<>();
}
