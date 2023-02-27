
package com.backendportfolio.repository;

import com.backendportfolio.model.ExperienciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<ExperienciaEntity, Long>{
    
}
