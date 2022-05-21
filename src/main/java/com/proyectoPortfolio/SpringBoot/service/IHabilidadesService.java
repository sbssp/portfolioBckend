
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Habilidades;
import java.util.List;


public interface IHabilidadesService {
    
public List<Habilidades> verHabilidades();
public void agregarHabilidades(Habilidades habilidades);
public void borrarHabilidades(Long id);
public Habilidades buscarHabilidades(Long id);
}
