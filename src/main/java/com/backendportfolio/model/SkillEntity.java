
package com.backendportfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
public class SkillEntity {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "html_skill")
  private boolean htmlSkill;
  
  @Column(name = "css_skill")
  private boolean cssSkill;
  
  @Column(name = "javascript_skill")
  private boolean javaScriptSkill;
  
  @Column(name = "java_skill")
  private boolean javaSkill;
  
  @Column(name = "angular_skill")
  private boolean angularSkill;
  
  @Column(name = "react_skill")
  private boolean reactSkill;
  
  @Column(name = "python_skill")
  private boolean pythonSkill;
  
  @Column(name = "db_skill")
  private boolean dbSkill;
}
