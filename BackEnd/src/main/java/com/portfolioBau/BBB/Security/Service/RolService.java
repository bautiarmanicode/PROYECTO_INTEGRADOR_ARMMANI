
package com.portfolioBau.BBB.Security.Service;

import com.portfolioBau.BBB.Security.Entity.Rol;
import com.portfolioBau.BBB.Security.Enums.RolNombre;
import com.portfolioBau.BBB.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
        
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
