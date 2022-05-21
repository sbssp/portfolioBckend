
package com.proyectoPortfolio.SpringBoot.controller;

import com.proyectoPortfolio.SpringBoot.model.Estudios;
import com.proyectoPortfolio.SpringBoot.model.Experiencia;
import com.proyectoPortfolio.SpringBoot.model.Habilidades;
import com.proyectoPortfolio.SpringBoot.model.Persona;
import com.proyectoPortfolio.SpringBoot.model.Proyectos;
import com.proyectoPortfolio.SpringBoot.service.EstudiosService;
import com.proyectoPortfolio.SpringBoot.service.ExperienciaService;
import com.proyectoPortfolio.SpringBoot.service.HabilidadesService;
import com.proyectoPortfolio.SpringBoot.service.PersonaService;
import com.proyectoPortfolio.SpringBoot.service.ProyectosService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge= 3600)
@RestController
public class Controller {
    
@Autowired 
PersonaService personaServ;
@Autowired
ExperienciaService experienciaServ;
@Autowired
HabilidadesService habilidadesServ;
@Autowired
EstudiosService estudiosServ;
@Autowired
ProyectosService proyectoServ;


List<Persona> listaPersona = new ArrayList();
List<Habilidades> listaHabilidades = new ArrayList();
List<Estudios> listaEstudios = new ArrayList();
List<Proyectos> listaProyectos = new ArrayList();
List<Experiencia> listaExperiencia = new ArrayList();



//Controladores de Persona
@GetMapping ("/ver/persona")
@ResponseBody
public List<Persona> verPersona(){
    return personaServ.verPersona();
}

@PutMapping("/new/persona")
public void agregarPersona(@RequestBody Persona persona){
    personaServ.agregarPersona(persona);
}

@GetMapping("/buscar/persona/{id}")
public void buscarPersona(@PathVariable Long id){
    personaServ.buscarPersona(id);
}

@PostMapping("/borrar/persona/{id}")
public void borrarPersona(@PathVariable Long id){
    personaServ.borrarPersona(id);
}



//Controladores de Experiencia

@GetMapping ("/ver/experiencia")
@ResponseBody
public List<Experiencia> verExperiencia(){
    return experienciaServ.verExperiencia();
}

@PostMapping("/new/experiencia")
public void agregarExperiencia(@RequestBody Experiencia experiencia){
    experienciaServ.agregarExperiencia(experiencia);

}

@GetMapping("/buscar/experiencia/{id}")
public void buscarExperiencia(@PathVariable Long id){
    experienciaServ.buscarExperiencia(id);
}

@PostMapping("/borrar/experiencia/{id}")
public void borrarExperiencia(@PathVariable Long id){
    experienciaServ.borrarExperiencia(id);
}


//Controladores de Habilidades

@GetMapping ("/ver/habilidades")
@ResponseBody
public List<Habilidades> verHabilidades(){
    return habilidadesServ.verHabilidades();
}

@PutMapping("/new/habilidades/{id}")
public void agregarHabilidades(@RequestBody Habilidades habilidades, @PathVariable Long id){
    Persona idpers = personaServ.buscarPersona(id);
    habilidadesServ.agregarHabilidades(habilidades);

}

@GetMapping("/buscar/habilidades/{id}")
public void buscarHabilidades(@PathVariable Long id){
    habilidadesServ.buscarHabilidades(id);
}

@PostMapping("/borrar/habilidades/{id}")
public void borrarHabilidades(@PathVariable Long id){
    habilidadesServ.borrarHabilidades(id);
}


//Controladores de Estudios

@GetMapping ("/ver/estudios")
@ResponseBody
public List<Estudios> verEstudios(){
    return estudiosServ.verEstudios();
}

@PutMapping("/new/estudios/{id}")
public void agregarEstudios(@RequestBody Estudios estudios, @PathVariable Long id){
    estudiosServ.agregarEstudios(estudios);

}

@GetMapping("/buscar/estudios/{id}")
public void buscarEstudios(@PathVariable Long id){
    estudiosServ.buscarEstudios(id);
}

@PostMapping("/borrar/estudios/{id}")
public void borrarEstudios(@PathVariable Long id){
    estudiosServ.borrarEstudios(id);
}


//Controladores de Proyectos

@GetMapping ("/ver/proyectos")
@ResponseBody
public List<Proyectos> verProyectos(){
    return proyectoServ.verProyectos();
}

@PutMapping("/new/proyectos/{id}")
public void agregarProyectos(@RequestBody Proyectos proyecto, @PathVariable Long id){
    proyectoServ.agregarProyecto(proyecto); 

}

@GetMapping("/buscar/proyectos/{id}")
public void buscarProyectos(@PathVariable Long id){
    proyectoServ.buscarProyecto(id);
}

@PostMapping("/borrar/proyectos/{id}")
public void borrarProyecto(@PathVariable Long id){
    proyectoServ.borrarProyecto(id);
}










}