
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Habilidades;
import com.proyectoPortfolio.SpringBoot.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{

@Autowired
HabilidadesRepository habilidadesRepo;
    
    
    @Override
    public List<Habilidades> verHabilidades() {
        return habilidadesRepo.findAll();
    }

    @Override
    public void agregarHabilidades(Habilidades habilidades) {
        habilidadesRepo.save(habilidades);
     }

    @Override
    public void borrarHabilidades(Long id) {
        habilidadesRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidades(Long id) {
        return habilidadesRepo.findById(id).orElse(null);
    }
    
}
