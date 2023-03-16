
package com.backendportfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class ContactEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "email_contact")
    private String email;
    
    @Column(name = "ig_contact", nullable = true)
    private String ig;
    
    @Column(name = "linkedin_contact")
    private String linkedin;
    
    @Column(name = "github_contact")
    private String gitHub;
}