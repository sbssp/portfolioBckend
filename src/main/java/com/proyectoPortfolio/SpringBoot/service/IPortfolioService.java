
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.fichaPersona;
import java.util.List;


public interface IPortfolioService {
public List<fichaPersona> verPortfolio();
public void agregarPersona(fichaPersona ficha);

}
