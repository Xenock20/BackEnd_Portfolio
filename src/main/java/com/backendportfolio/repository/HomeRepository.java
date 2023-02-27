
package com.backendportfolio.repository;

import com.backendportfolio.model.HomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<HomeEntity, Long>{
    
}
