
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
    @ManyToOne 
    @JoinColumn(name = "persona_id")
    private Persona persona_hab;
    
    
    public Habilidades (){
        
    }

    public Habilidades(Long id, String habilidad, Long dominio, Persona persona_hab) {
        this.id = id;
        this.habilidad = habilidad;
        this.dominio = dominio;
        this.persona_hab = persona_hab;
    }
    
    
    
    
}
