
package com.backendportfolio.service;

import com.backendportfolio.model.*;
import java.util.List;
import org.springframework.http.ResponseEntity;


public interface HomeService {
    
    List<HomeEntity> mostrarHome();
    
    HomeEntity actualizarHome(Long id, HomeEntity homeEntity);
    
    List<SkillEntity> mostrarSkills();
    
    List<ContactEntity> mostrarContact();
    
    SkillEntity actualizarSkills(Long id, SkillEntity skillEntity);
    
    ContactEntity actualizarContact(Long id, ContactEntity contactEntity);
    
    
    List<EducacionEntity> mostrarEduaciones();
    
    List<ExperienciaEntity> mostrarExperiencias();
    
    List<ProjectEntity> mostrarProjects();
    
    EducacionEntity agregarEduacion(Long idHome, EducacionEntity educacionEntity);
    
    ExperienciaEntity agregarExperiencia(Long idHome, ExperienciaEntity experienciaEntity);
    
    ProjectEntity agregarProject(Long idHome, ProjectEntity projectEntity);   
    
    EducacionEntity actualizarEducacion(Long idEduacion, EducacionEntity educacionEntity);
    
    ExperienciaEntity actualizarExperiencia(Long idExperiencia, ExperienciaEntity experienciaEntity);
    
    ProjectEntity actualizarProject(Long idProject, ProjectEntity projectEntity);

    ResponseEntity<?> eliminarEducacion(Long idEduacion);
    
    ResponseEntity<?> eliminarExperiencia(Long idExperiencia);
    
    ResponseEntity<?> eliminarProject(Long idProject);
}