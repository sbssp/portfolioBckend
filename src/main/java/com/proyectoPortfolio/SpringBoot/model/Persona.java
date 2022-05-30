
package com.proyectoPortfolio.SpringBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
@Id    
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nombre;
private String apellido;
private String email;
private String telefono;
private String fotopers;
private String link;
private Long edad;
@Column(columnDefinition = "LONGTEXT")
private String resumen;




public  Persona(){

}

    public Persona(Long id, String nombre, String apellido, String email, String telefono, String fotopers, Long edad, String resumen, String link) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fotopers = fotopers;
        this.edad = edad;
        this.resumen = resumen;
        this.link = link;

    }

   



   

 
  

}

