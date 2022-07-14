
package com.portfolioBau.BBB.Interface;

import com.portfolioBau.BBB.Entity.Persona;
import java.util.List;



public interface iPersonaService {

public List<Persona> getPersona(); 
public void savePersona(Persona persona);     
public void deletePersona(Long id);
public Persona findPersona(Long id);

}
