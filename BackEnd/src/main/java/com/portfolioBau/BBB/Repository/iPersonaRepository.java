


package com.portfolioBau.BBB.Repository;

import com.portfolioBau.BBB.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface iPersonaRepository extends JpaRepository<Persona,Long> {
    
    
}
