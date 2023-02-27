
package com.backendportfolio.repository;

import com.backendportfolio.model.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<SkillEntity, Long>{
    
}
