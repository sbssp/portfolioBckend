
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Proyectos;
import com.proyectoPortfolio.SpringBoot.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{

@Autowired
ProyectosRepository proyectoRepo;
    
    
    @Override
    public List<Proyectos> verProyectos() {
        return proyectoRepo.findAll();
    }

    @Override
    public void agregarProyecto(Proyectos proyecto) {
        proyectoRepo.save(proyecto);
     }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }

    
}
