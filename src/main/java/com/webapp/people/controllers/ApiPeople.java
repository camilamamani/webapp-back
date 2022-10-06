package com.webapp.people.controllers;

import com.webapp.people.model.Persona;
import com.webapp.people.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("api")
public class ApiPeople {
    @Autowired
    PersonaService personasService;

    @GetMapping("/saludar")
    public String saludar(){
        return "Hola";
    }

    @GetMapping("/personas")
    public ArrayList<Persona> getAllPersonas(){

        return personasService.getAllPersonas();
    }

    @PostMapping("/persona/ guardar")
    public Persona savePersona(@RequestBody Persona a){
        return personasService.savePersona(a);
    }
}
