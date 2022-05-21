
package com.proyectoPortfolio.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long id;
    private String habilidad;
    private Long dominio;

    public Habilidades (){
        
    }

    public Habilidades(Long id, String habilidad, Long dominio) {
        this.id = id;
        this.habilidad = habilidad;
        this.dominio = dominio;
    }
    
    
    
    
}
