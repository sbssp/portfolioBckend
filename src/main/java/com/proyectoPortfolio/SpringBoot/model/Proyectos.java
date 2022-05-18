
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
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String nombre;
    private String enlace;
    private String descripcion;
    private String fecha;
    private String imagen;
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona_proy;
    
    
    public Proyectos (){
        
    }

    public Proyectos(Long id, String nombre, String enlace, String descripcion, String fecha,String imagen, Persona persona_proy) {
        this.id = id;
        this.nombre = nombre;
        this.enlace = enlace;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.persona_proy = persona_proy;
        this.imagen = imagen;
    }

   
    
    

    
}
