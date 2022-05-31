
package com.proyectoPortfolio.SpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", method = RequestMethod.GET)

public class testcontroller {
    
    public String index() {
        return "Hello World Test";
    }
}
