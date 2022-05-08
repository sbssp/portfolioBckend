
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

public class Estudios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estudio;
    private String descripcion;
    private String institucion;
    private String fecha_desde;
    private String fecha_hasta;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona_est;
    
    
    
    public Estudios(){
        
    }

    public Estudios(Long id, String estudio, String descripcion, String institucion, String fecha_desde, String fecha_hasta, Persona persona_est) {
        this.id = id;
        this.estudio = estudio;
        this.descripcion = descripcion;
        this.institucion = institucion;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.persona_est = persona_est;
    }

   
    
    
}
