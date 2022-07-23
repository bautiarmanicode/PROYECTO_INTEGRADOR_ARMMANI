package com.portfolioBau.BBB.Service;

import com.portfolioBau.BBB.Entity.Persona;
import com.portfolioBau.BBB.Interface.iPersonaService;
import com.portfolioBau.BBB.Repository.iPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImpPersonaService implements iPersonaService {

    @Autowired
    iPersonaRepository iPersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = iPersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        iPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        iPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = iPersonaRepository.findById(id).orElse(null);
        return persona;

    }

}
