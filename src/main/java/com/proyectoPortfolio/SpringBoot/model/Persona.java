
package com.proyectoPortfolio.SpringBoot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
@Id    
@GeneratedValue(strategy = GenerationType.IDENTITY)
//@Column (name = "persona_id")
private Long id;
//@Column (name = "persona_nombre")
private String nombre;
//@Column (name ="persona_apellido")
private String apellido;
//@Column (name = "persona_email")
private String email;
//@Column (name = "persona_telefono")
private String telefono;
//@Column (name = "persona_foto")
private String fotopers;
//@Column (name = "persona_edad")
private Long edad;
//@Column (name = "persona_resumen")
private String resumen;
@JsonIgnore
@OneToMany(mappedBy= "persona")
private Set<Experiencia> experiencia = new HashSet<>();


public  Persona(){

}

    public Persona(Long id, String nombre, String apellido, String email, String telefono, String fotopers, Long edad, String resumen, Set<Experiencia> experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fotopers = fotopers;
        this.edad = edad;
        this.resumen = resumen;
    }

   

 
  

}

