    
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Estudios;
import java.util.List;


public interface IEstudiosService {
    
public List<Estudios> verEstudios();
public void agregarEstudios(Estudios estudio);
public void borrarEstudios(Long id);
public Estudios buscarEstudios(Long id);
public Estudios editarEstudios(Estudios estudio);

}
