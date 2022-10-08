package com.webapp.people.controllers;

import com.webapp.people.model.Persona;
import com.webapp.people.service.PersonaService;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("api")
public class ApiPeople {
    @Autowired
    PersonaService personasService;

    @GetMapping("/personas")
    public ArrayList<Persona> getAllPersonas(){
        return personasService.getAllPersonas();
    }

    @PostMapping("/persona/guardar")
    public Persona savePersona(@RequestBody Persona a){
        return personasService.savePersona(a);
    }

    @GetMapping("/personas/{name}/{surname}")
    public ArrayList<Persona> filterPersonas(@PathVariable("name") String name, @PathVariable("surname") String surname){
        return personasService.filterPersonas(name, surname);
    }

}
