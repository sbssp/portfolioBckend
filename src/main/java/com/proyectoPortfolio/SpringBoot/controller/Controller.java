
package com.proyectoPortfolio.SpringBoot.controller;

import com.proyectoPortfolio.SpringBoot.model.fichaPersona;
import com.proyectoPortfolio.SpringBoot.service.PortfolioService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
@Autowired 
PortfolioService portfolioServ;

List<fichaPersona> listaPortfolio = new ArrayList();


@GetMapping ("/portfolio")
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

@PostMapping ("/new/portfolio")
public void agregarPortfolio(@RequestBody fichaPersona ficha){
portfolioServ.agregarPersona(ficha);
}

}
