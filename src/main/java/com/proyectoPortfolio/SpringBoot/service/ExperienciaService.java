
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Experiencia;
import com.proyectoPortfolio.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

@Autowired
ExperienciaRepository experienciaRepo;

    @Override
    public List<Experiencia> crearExperiencia() {
        return experienciaRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    @Override
    public void buscarExperiencia(Long id) {
        experienciaRepo.findById(id).get();
    }

 

   
}
