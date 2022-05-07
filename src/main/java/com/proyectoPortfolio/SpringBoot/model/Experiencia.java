
package com.proyectoPortfolio.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Experiencia {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private String puesto;
private String Empresa;
private String Descripcion;
private String fecha_desde;
private String fecha_hasta;

public Experiencia(){
    
}

    public Experiencia(String puesto, String Empresa, String Descripcion, String fecha_desde, String fecha_hasta) {
        this.puesto = puesto;
        this.Empresa = Empresa;
        this.Descripcion = Descripcion;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }



    
}
