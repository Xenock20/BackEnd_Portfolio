
package com.backendportfolio.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class HomeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    
    @Column(name = "titulo_home")
    private String tituloHome;
    
    @Column(name = "descripcion_home")
    private String descripcionHome;
    
    @Column(name = "url_image_home")
    private String urlImageHome;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skills_id", referencedColumnName = "id")
    private SkillEntity skills;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contacts_id", referencedColumnName = "id")
    private ContactEntity contactos;
    
    @OneToMany(mappedBy = "home", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<EducacionEntity> educaciones;
    
    @OneToMany(mappedBy = "home", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ExperienciaEntity> experiencias;
    
    @OneToMany(mappedBy = "home", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ProjectEntity> projectos;
}
