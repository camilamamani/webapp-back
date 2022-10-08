package com.webapp.people.service;
import com.webapp.people.model.Persona;
import java.util.ArrayList;

public interface PersonaService {
    ArrayList<Persona> getAllPersonas();
    Persona savePersona(Persona a);
    ArrayList<Persona> filterPersonas(String nombre, String apellido);
}
