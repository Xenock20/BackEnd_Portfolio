
package com.backendportfolio.service;

import com.backendportfolio.model.*;
import com.backendportfolio.repository.*;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<SkillEntity> mostrarSkills(Long id) {
        return skillRepository.findAll();
    }

    @Override
    public List<ContactEntity> mostrarContact(Long id) {
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ExperienciaEntity> mostrarExperiencias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ProjectEntity> mostrarProjects() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EducacionEntity agregarEduacion(Long idHome, EducacionEntity educacionEntity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ExperienciaEntity agregarExperiencia(Long idHome, ExperienciaEntity experienciaEntity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProjectEntity agregarProject(Long idHome, ProjectEntity projectEntity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EducacionEntity actualizarEducacion(Long idHome, Long idEduacion, EducacionEntity educacionEntity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ExperienciaEntity actualizarExperiencia(Long idHome, Long idExperiencia, ExperienciaEntity experienciaEntity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProjectEntity actualizarProject(Long idHome, Long idProject, ProjectEntity projectEntity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarEducacion(Long idHome, Long idEduacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarExperiencia(Long idHome, Long idExperiencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarProject(Long idHome, Long idProject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
