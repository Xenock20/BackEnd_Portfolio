
package com.backendportfolio.service;

import com.backendportfolio.model.*;
import java.util.List;


public interface HomeService {
    
    List<HomeEntity> mostrarHome();
    
    HomeEntity actualizarHome(Long id, HomeEntity homeEntity);
    
    List<SkillEntity> mostrarSkills(Long id);
    
    List<ContactEntity> mostrarContact(Long id);
    
    SkillEntity actualizarSkills(Long id, SkillEntity skillEntity);
    
    ContactEntity actualizarContact(Long id, ContactEntity contactEntity);
    
    List<EducacionEntity> mostrarEduaciones();
    
    List<ExperienciaEntity> mostrarExperiencias();
    
    List<ProjectEntity> mostrarProjects();
    
    EducacionEntity agregarEduacion(Long idHome, EducacionEntity educacionEntity);
    
    ExperienciaEntity agregarExperiencia(Long idHome, ExperienciaEntity experienciaEntity);
    
    ProjectEntity agregarProject(Long idHome, ProjectEntity projectEntity);
    
    EducacionEntity actualizarEducacion(Long idHome, Long idEduacion, EducacionEntity educacionEntity);
    
    ExperienciaEntity actualizarExperiencia(Long idHome, Long idExperiencia, ExperienciaEntity experienciaEntity);
    
    ProjectEntity actualizarProject(Long idHome, Long idProject, ProjectEntity projectEntity);
    
    void eliminarEducacion(Long idHome, Long idEduacion);
    
    void eliminarExperiencia(Long idHome, Long idExperiencia);
    
    void eliminarProject(Long idHome, Long idProject);
}
