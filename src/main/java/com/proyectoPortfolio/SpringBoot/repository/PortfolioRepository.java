
package com.proyectoPortfolio.SpringBoot.repository;

import com.proyectoPortfolio.SpringBoot.model.fichaPersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository <fichaPersona, Long> {
    
}
