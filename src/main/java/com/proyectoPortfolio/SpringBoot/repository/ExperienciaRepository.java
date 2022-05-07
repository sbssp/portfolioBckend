
package com.proyectoPortfolio.SpringBoot.repository;

import com.proyectoPortfolio.SpringBoot.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
}
