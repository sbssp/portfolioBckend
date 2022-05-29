
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Estudios;
import com.proyectoPortfolio.SpringBoot.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService{

@Autowired
EstudiosRepository estudiosRepo;
    
    
    @Override
    public List<Estudios> verEstudios() {
        return estudiosRepo.findAll();
    }

    @Override
    public void agregarEstudios(Estudios estudios) {
        estudiosRepo.save(estudios);
     }

    @Override
    public void borrarEstudios(Long id) {
        estudiosRepo.deleteById(id);
    }

    @Override
    public Estudios buscarEstudios(Long id) {
        return estudiosRepo.findById(id).orElse(null);
    }

    @Override
    public Estudios editarEstudios(Estudios estudio) {
        return estudiosRepo.save(estudio);    }
    
}
