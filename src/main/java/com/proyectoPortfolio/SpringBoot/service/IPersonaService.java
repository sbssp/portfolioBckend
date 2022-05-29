
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    
public List<Persona> verPersona();
public void agregarPersona(Persona persona);
public void borrarPersona(Long id);
public Persona buscarPersona(Long id);
public Persona editarPersona(Persona persona);


}
