package com.webapp.people.service;

import com.webapp.people.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.webapp.people.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService{
    @Autowired
    PersonaRepository personasRep;
    @Override
    public ArrayList<Persona> getAllPersonas() {
        return (ArrayList<Persona>) personasRep.findAll();
    }

    @Override
    public Persona savePersona(Persona a){
        return personasRep.save(a);
    }
}
