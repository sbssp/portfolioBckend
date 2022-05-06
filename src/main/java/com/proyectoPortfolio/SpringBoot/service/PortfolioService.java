
package com.proyectoPortfolio.SpringBoot.service;

import com.proyectoPortfolio.SpringBoot.model.fichaPersona;
import com.proyectoPortfolio.SpringBoot.repository.PortfolioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PortfolioService implements IPortfolioService{
    
@Autowired 
public PortfolioRepository portfolioRepo;

    @Override
    public List<fichaPersona> verPortfolio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    @Override
    public void agregarPersona(fichaPersona ficha) {
       portfolioRepo.save(ficha);
    }
    
    
}
