
package com.proyectoPortfolio.SpringBoot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
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
private Long id;
private String nombre;
private String apellido;
private String email;
private String telefono;
private String fotopers;
private Long edad;
private String resumen;
@JsonIgnore
@OneToMany(mappedBy = "persona_exp", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Experiencia> experiencia = new ArrayList<Experiencia>();
@JsonIgnore
@OneToMany(mappedBy = "persona_hab", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Habilidades> habilidades = new ArrayList<Habilidades>();
@JsonIgnore
@OneToMany(mappedBy = "persona_proy", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Proyectos> proyectos = new ArrayList<Proyectos>();
@JsonIgnore
@OneToMany(mappedBy = "persona_est", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Estudios> estudios = new ArrayList<Estudios>();



public  Persona(){

}

    public Persona(Long id, String nombre, String apellido, String email, String telefono, String fotopers, Long edad, String resumen) {
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

