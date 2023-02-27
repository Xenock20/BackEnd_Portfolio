
package com.backendportfolio.repository;

import com.backendportfolio.model.EducacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<EducacionEntity, Long>{
    
}
