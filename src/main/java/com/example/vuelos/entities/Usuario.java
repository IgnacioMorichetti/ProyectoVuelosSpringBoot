package com.example.vuelos.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario extends Persona {

    @Column(nullable = false)
    private String contraseniaUsuario;

    @Column(nullable = false, unique = true)
    private String correoElectronicoUsuario;

    @OneToMany(mappedBy = "usuario")
    @JsonIgnore
    private List<Reserva> reservas = new ArrayList<>();

    @OneToMany(mappedBy = "usuario")
    @JsonIgnore
    private List<Consulta> consultas = new ArrayList<>();
}
