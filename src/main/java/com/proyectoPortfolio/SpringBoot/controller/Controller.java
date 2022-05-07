
package com.proyectoPortfolio.SpringBoot.controller;

import com.proyectoPortfolio.SpringBoot.model.Experiencia;
import com.proyectoPortfolio.SpringBoot.model.Persona;
import com.proyectoPortfolio.SpringBoot.repository.ExperienciaRepository;
import com.proyectoPortfolio.SpringBoot.repository.PersonaRepository;
import com.proyectoPortfolio.SpringBoot.service.ExperienciaService;
import com.proyectoPortfolio.SpringBoot.service.PersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
@Autowired 
PersonaService personaServ;
@Autowired
ExperienciaService experienciaServ;

List<Persona> listaPersona = new ArrayList();


@GetMapping ("/ver/persona")
@ResponseBody
public String verPortfolio (@RequestParam Long persona_id, 
                            @RequestParam String persona_nombre,
                            @RequestParam String persona_apellido,
                            @RequestParam String persona_email,
                            @RequestParam String persona_telefono,
                            @RequestParam String persona_foto,
                            @RequestParam Long persona_edad,
                            @RequestParam String persona_resumen){
    
    return persona_id + persona_nombre + persona_apellido;
}


@PostMapping("/new/persona/")
public void agregarPersona(@RequestBody Persona persona){
personaServ.agregarPersona(persona);
}

@PutMapping ("/new/experiencia/")
public void agregarExperiencia(@RequestBody Experiencia experiencia){
experienciaServ.agregarExperiencia(experiencia);
}

/*@PutMapping ("/new/experiencia/{persId}/{id}/{puesto}/{empresa}/{descripcion}/{fecha_desde}/{fecha_hasta}")
public Experiencia agregarExperiencia(@PathVariable Long persId,
                                      @PathVariable Long id,
                                      @PathVariable String puesto,
                                      @PathVariable String empresa,
                                      @PathVariable String descripcion,
                                      @PathVariable String fecha_desde,
                                      @PathVariable String fecha_hasta){

Persona perso = personaServ.buscarPersona(persId);
Experiencia exp = experienciaServ.buscarExperiencia(id);

experienciaServ.agregarExperiencia(exp);
}
*/



}