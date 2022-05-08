
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
public List<Proyectos> verProyectos();
public void agregarProyecto(Proyectos proyecto);
public void borrarProyecto(Long id);
public Proyectos buscarProyecto(Long id);
}
