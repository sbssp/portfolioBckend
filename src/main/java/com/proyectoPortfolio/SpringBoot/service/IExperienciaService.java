
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.Experiencia;
import java.util.List;


public interface IExperienciaService {

public List<Experiencia> crearExperiencia();
public void agregarExperiencia(Experiencia experiencia);
public void borrarExperiencia(Long id);
public void buscarExperiencia(Long id);

}
