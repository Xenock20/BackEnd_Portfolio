
package com.backendportfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class ProjectEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "url_image_project")
    private String urlImageProject;
    
    @Column(name = "nombre_project")
    private String nombreProject;
    
    @Column(name = "descripcion_project")
    private String descripcionProject;
    
    @Column(name = "link_demo_project")
    private String linkDemoProject;
    
    @Column(name = "link_code_project")
    private String linkCodeProject;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_id")
    @JsonBackReference
    private HomeEntity home;
}
