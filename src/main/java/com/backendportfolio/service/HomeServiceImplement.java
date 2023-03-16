
package com.backendportfolio.service;

import com.backendportfolio.model.*;
import com.backendportfolio.repository.*;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImplement implements HomeService{

    @Autowired
    private HomeRepository homeRepository;
    
    @Autowired
    private SkillRepository skillRepository;
    
    @Autowired
    private ContactRepository contactRepository;
    
    @Autowired
    private EducacionRepository educacionRepository;
    
    @Autowired
    private ExperienciaRepository experienciaRepository;
    
    @Autowired
    private ProjectRepository projectRepository;
    
    
    @Override
    public List<HomeEntity> mostrarHome() {
        return homeRepository.findAll();
    }

    @Override
    public HomeEntity actualizarHome(Long id, HomeEntity homeActualizado) {
        
        Optional<HomeEntity> homeExitente = homeRepository.findById(id);
        
        if(homeExitente.isPresent()){
            HomeEntity home = homeExitente.get();
            
            home.setNombreCompleto(homeActualizado.getNombreCompleto());
            home.setTituloHome(homeActualizado.getTituloHome());
            home.setDescripcionHome(homeActualizado.getDescripcionHome());
            home.setUrlImageHome(homeActualizado.getUrlImageHome());
            
            return home;
        } else {
            throw new EntityNotFoundException("Objeto no encontrado");
        }
    }

    @Override
    public List<SkillEntity> mostrarSkills() {
        return skillRepository.findAll();
    }

    @Override
    public List<ContactEntity> mostrarContact() {
        return contactRepository.findAll();
    }

    @Override
    public SkillEntity actualizarSkills(Long id, SkillEntity skillActualizado) {
        Optional<SkillEntity> skillExitente = skillRepository.findById(id);
        
        if(skillExitente.isPresent()){
            SkillEntity skill = skillExitente.get();
            
            skill.setAngularSkill(skillActualizado.isAngularSkill());
            skill.setCssSkill(skillActualizado.isCssSkill());
            skill.setDbSkill(skillActualizado.isDbSkill());
            skill.setHtmlSkill(skillActualizado.isHtmlSkill());
            skill.setJavaScriptSkill(skillActualizado.isJavaScriptSkill());
            skill.setJavaSkill(skillActualizado.isJavaSkill());
            skill.setPythonSkill(skillActualizado.isPythonSkill());
            skill.setReactSkill(skillActualizado.isReactSkill());
            
            return skill;
        } else {
            throw new EntityNotFoundException("Objeto no encontrado");
        }
    }

    @Override
    public ContactEntity actualizarContact(Long id, ContactEntity contactActualizado) {
        Optional<ContactEntity> contactExitente = contactRepository.findById(id);
        
        if(contactExitente.isPresent()){
            ContactEntity contact = contactExitente.get();
            
            contact.setEmail(contactActualizado.getEmail());
            contact.setGitHub(contactActualizado.getGitHub());
            contact.setIg(contactActualizado.getIg());
            contact.setLinkedin(contactActualizado.getLinkedin());
            
            return contact;
        } else {
            throw new EntityNotFoundException("Objeto no encontrado");
        }
    }

    
    @Override
    public List<EducacionEntity> mostrarEduaciones() {
        return educacionRepository.findAll();
    }

    @Override
    public List<ExperienciaEntity> mostrarExperiencias() {
        return experienciaRepository.findAll();
    }

    @Override
    public List<ProjectEntity> mostrarProjects() {
        return projectRepository.findAll();
    }

    /*
    @Override
    public EducacionEntity agregarEduacion(Long idHome, EducacionEntity educacionEntity){
        return homeRepository.findById(idHome).map(home -> {
            educacionEntity.setHome(home);
            return educacionRepository.save(educacionEntity);
        }).orElseThrow(() -> new EntityNotFoundException("Error en agregar una educacion"));
    }

    
    @Override
    public ExperienciaEntity agregarExperiencia(Long idHome, ExperienciaEntity experienciaEntity) {
        return homeRepository.findById(idHome).map(home -> {
            experienciaEntity.setHome(home);
            return experienciaRepository.save(experienciaEntity);
        }).orElseThrow(() -> new EntityNotFoundException("Error en agregar una experiencia"));
    }

    @Override
    public ProjectEntity agregarProject(Long idHome, ProjectEntity projectEntity) {
        return homeRepository.findById(idHome).map(home -> {
            projectEntity.setHome(home);
            return projectRepository.save(projectEntity);
        }).orElseThrow(() -> new EntityNotFoundException("Error en agregar un proyecto"));
    }

    @Override
    public EducacionEntity actualizarEducacion(Long idEduacion, EducacionEntity educacionEntity) {
        return educacionRepository.findById(idEduacion).map(education -> {
            education.setFechaDeInicio(educacionEntity.getFechaDeInicio());
            education.setFechaDeFinalizacion(educacionEntity.getFechaDeFinalizacion());
            education.setTituloEducacion(educacionEntity.getTituloEducacion());
            education.setUbicacion(educacionEntity.getUbicacion());
            return educacionRepository.save(education);
        }).orElseThrow(() -> new EntityNotFoundException("Error en actualizar una educacion"));
    }

    @Override
    public ExperienciaEntity actualizarExperiencia(Long idExperiencia, ExperienciaEntity experienciaEntity) {
        return experienciaRepository.findById(idExperiencia).map(experiencia -> {
            experiencia.setFechaDeInicio(experienciaEntity.getFechaDeInicio());
            experiencia.setFechaDeFinalizacion(experienciaEntity.getFechaDeFinalizacion());
            experiencia.setTituloExperiencia(experienciaEntity.getTituloExperiencia());
            experiencia.setUbicacion(experienciaEntity.getUbicacion());
            return experienciaRepository.save(experiencia);
        }).orElseThrow(() -> new EntityNotFoundException("Error en actualizar una experienci"));
    }

    @Override
    public ProjectEntity actualizarProject(Long idProject, ProjectEntity projectEntity) {
        return projectRepository.findById(idProject).map(project -> {
            project.setDescripcionProject(projectEntity.getDescripcionProject());
            project.setLinkCodeProject(projectEntity.getLinkCodeProject());
            project.setLinkDemoProject(projectEntity.getLinkDemoProject());
            project.setNombreProject(projectEntity.getNombreProject());
            project.setUrlImageProject(projectEntity.getUrlImageProject());
            return projectRepository.save(project);
        }).orElseThrow(() -> new EntityNotFoundException("Error en actualizar un proyecto"));
    }

    @Override
    public ResponseEntity<?> eliminarEducacion(Long idEduacion) {
        return educacionRepository.findById(idEduacion).map(educacion -> {
           educacionRepository.delete(educacion);
           return ResponseEntity.ok().build();
        }).orElseThrow(() -> new EntityNotFoundException("Error en eliminar una educacion"));
    }

    @Override
    public ResponseEntity<?> eliminarExperiencia(Long idExperiencia) {
        return experienciaRepository.findById(idExperiencia).map(experiencia -> {
            experienciaRepository.delete(experiencia);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new EntityNotFoundException("Error en eliminar una experiencia"));
    }

    @Override
    public ResponseEntity<?> eliminarProject(Long idProject) {
        return projectRepository.findById(idProject).map(project -> {
            projectRepository.delete(project);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new EntityNotFoundException("Error en eliminar un proyecto"));
    }
    */
}