
package com.backendportfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class EducacionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "titulo_educacion")
    private String tituloEducacion;

    @Column(name = "fecha_de_inicio_educacion")
    private Date fechaDeInicio;

    @Column(name = "fecha_de_finalizacion_educacion")
    private Date fechaDeFinalizacion;

    @Column(name = "ubicacion_educacion")
    private String ubicacion;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_id")
    @JsonBackReference
    private HomeEntity home;
}
