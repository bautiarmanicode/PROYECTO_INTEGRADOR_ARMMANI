
package com.portfolioBau.BBB.Security.Repository;

import com.portfolioBau.BBB.Security.Entity.Rol;
import com.portfolioBau.BBB.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
    
}
