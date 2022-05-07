
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectoPortfolio.SpringBoot.repository.PersonaRepository;


@Service
public class PersonaService implements IPersonaService{
    
@Autowired 
public PersonaRepository personaRepo;

    @Override
    public List<Persona> crearPersona() {
        return personaRepo.findAll();
    }

    @Override
    public void agregarPersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public void buscarPersona(Long id) {
        personaRepo.findById(id).get();
    }


}