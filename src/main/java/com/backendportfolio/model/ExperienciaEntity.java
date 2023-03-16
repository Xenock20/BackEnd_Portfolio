
package com.backendportfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class ExperienciaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "titulo_experiencia")
    private String tituloExperiencia;

    @Column(name = "fecha_de_inicio_experiencia")
    private Date fechaDeInicio;

    @Column(name = "fecha_de_finalizacion_experiencia")
    private Date fechaDeFinalizacion;

    @Column(name = "ubicacion_experiencia")
    private String ubicacion;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_id")
    @JsonBackReference
    private HomeEntity home;
}