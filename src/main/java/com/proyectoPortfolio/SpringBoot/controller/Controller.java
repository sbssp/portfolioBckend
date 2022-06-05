
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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
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

@PostMapping("/new/persona")
@PreAuthorize("hasRole('ADMIN')")
public void agregarPersona(@RequestBody Persona persona){
    personaServ.agregarPersona(persona);
}

@PutMapping("/editar/persona")
@PreAuthorize("hasRole('ADMIN')")
public void editarPersona(@RequestBody Persona persona){
    personaServ.editarPersona(persona);

}

@GetMapping("/buscar/persona/{id}")
@PreAuthorize("hasRole('ADMIN')")
public Persona buscarPersona(@PathVariable Long id){
    return personaServ.buscarPersona(id);
}




//Controladores de Experiencia

@GetMapping ("/ver/experiencia")
@ResponseBody
public List<Experiencia> verExperiencia(){
    return experienciaServ.verExperiencia();
}

@PostMapping("/new/experiencia")
@PreAuthorize("hasRole('ADMIN')")
public void agregarExperiencia(@RequestBody Experiencia experiencia){
    experienciaServ.agregarExperiencia(experiencia);

}

@PutMapping("/editar/experiencia")
@PreAuthorize("hasRole('ADMIN')")
public void editarExperiencia(@RequestBody Experiencia experiencia){
    experienciaServ.editarExperiencia(experiencia);

}

@GetMapping("/buscar/experiencia/{id}")
@PreAuthorize("hasRole('ADMIN')")
public Experiencia buscarExperiencia(@PathVariable Long id){
    return experienciaServ.buscarExperiencia(id);
}

@DeleteMapping("/borrar/experiencia/{id}")
@PreAuthorize("hasRole('ADMIN')")
public void borrarExperiencia(@PathVariable Long id){
     experienciaServ.borrarExperiencia(id);
}


//Controladores de Habilidades

@GetMapping ("/ver/habilidades")
@ResponseBody
public List<Habilidades> verHabilidades(){
    return habilidadesServ.verHabilidades();
}

@PostMapping("/new/habilidades")
@PreAuthorize("hasRole('ADMIN')")
public void agregarHabilidades(@RequestBody Habilidades habilidades){
    habilidadesServ.agregarHabilidades(habilidades);

}

@PutMapping("/editar/habilidades")
@PreAuthorize("hasRole('ADMIN')")
public void editarHabilidades(@RequestBody Habilidades habilidades){
    habilidadesServ.editarHabilidades(habilidades);

}

@GetMapping("/buscar/habilidades/{id}")
@PreAuthorize("hasRole('ADMIN')")
public Habilidades buscarHabilidades(@PathVariable Long id){
    return habilidadesServ.buscarHabilidades(id);
}

@DeleteMapping("/borrar/habilidades/{id}")
@PreAuthorize("hasRole('ADMIN')")
public void borrarHabilidades(@PathVariable Long id){
     habilidadesServ.borrarHabilidades(id);
}



//Controladores de Estudios

@GetMapping ("/ver/estudios")
@ResponseBody
public List<Estudios> verEstudios(){
    return estudiosServ.verEstudios();
}

@PostMapping("/new/estudios")
@PreAuthorize("hasRole('ADMIN')")
public void agregarEstudios(@RequestBody Estudios estudios){
    estudiosServ.agregarEstudios(estudios);

}

@PutMapping("/editar/estudios")
@PreAuthorize("hasRole('ADMIN')")
public void editarEstudios(@RequestBody Estudios estudios){
    estudiosServ.editarEstudios(estudios);

}

@GetMapping("/buscar/estudios/{id}")
@PreAuthorize("hasRole('ADMIN')")
public Estudios buscarEstudios(@PathVariable Long id){
    return estudiosServ.buscarEstudios(id);
}

@DeleteMapping("/borrar/estudios/{id}")
@PreAuthorize("hasRole('ADMIN')")
public void borrarEstudios(@PathVariable Long id){
     estudiosServ.borrarEstudios(id);
}



//Controladores de Proyectos

@GetMapping ("/ver/proyectos")
@ResponseBody
public List<Proyectos> verProyectos(){
    return proyectoServ.verProyectos();
}

@PostMapping("/new/proyectos")
@PreAuthorize("hasRole('ADMIN')")
public void agregarProyecto(@RequestBody Proyectos proyecto){
    proyectoServ.agregarProyecto(proyecto);

}

@PutMapping("/editar/proyectos")
@PreAuthorize("hasRole('ADMIN')")
public void editarProyecto(@RequestBody Proyectos proyecto){
    proyectoServ.editarProyecto(proyecto);

}

@GetMapping("/buscar/proyectos/{id}")
@PreAuthorize("hasRole('ADMIN')")
public Proyectos buscarProyectos(@PathVariable Long id){
    return proyectoServ.buscarProyecto(id);
}

@DeleteMapping("/borrar/proyectos/{id}")
@PreAuthorize("hasRole('ADMIN')")
public void borrarProyecto(@PathVariable Long id){
     proyectoServ.borrarProyecto(id);
}











}