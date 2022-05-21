
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Experiencia;
import java.util.List;


public interface IExperienciaService {

public List<Experiencia> verExperiencia();
public void agregarExperiencia(Experiencia experiencia);
public void borrarExperiencia(Long id);
public Experiencia buscarExperiencia(Long id);

}
