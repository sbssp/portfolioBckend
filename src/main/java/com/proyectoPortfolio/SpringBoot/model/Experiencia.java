
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
public class Experiencia {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String puesto;
private String empresa;
private String descripcion;
private String fecha_desde;
private String fecha_hasta;
@ManyToOne
@JoinColumn(name = "persona_id")
private Persona persona_exp;


public Experiencia(){
    
}

    public Experiencia(Long id, String puesto, String empresa, String descripcion, String fecha_desde, String fecha_hasta, Persona persona_exp) {
        this.id = id;
        this.puesto = puesto;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.persona_exp = persona_exp;
    }

    

   



    
}
