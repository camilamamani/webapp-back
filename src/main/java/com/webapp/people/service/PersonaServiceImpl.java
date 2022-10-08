package com.webapp.people.service;

import com.webapp.people.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.webapp.people.model.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@Service
public class PersonaServiceImpl implements PersonaService{
    @Autowired
    PersonaRepository personasRep;
    @Autowired
    private EntityManagerFactory emf;
    @Override
    public ArrayList<Persona> getAllPersonas() {

        return (ArrayList<Persona>) personasRep.findAll();
    }

    @Override
    public Persona savePersona(Persona a){
        return personasRep.save(a);
    }

    @Override
    public ArrayList<Persona> filterPersonas(String nombre, String apellido) {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("from Persona where name like '"+nombre+"%' and surname like '"+apellido+"%'");
        ArrayList<Persona> personas = (ArrayList<Persona>) query.getResultList();
        return personas;
    }

}
