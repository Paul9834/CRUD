package com.persona.ejemplo.release.servicio;

import com.persona.ejemplo.release.interfaceService.Interface_Persona_Servicio;
import com.persona.ejemplo.release.interfaces.Interface_Persona;
import com.persona.ejemplo.release.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonaService implements Interface_Persona_Servicio {

    @Autowired
    private Interface_Persona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {

        return Optional.empty();


    }

    @Override
    public int save(Persona p) {
        int res=0;
        Persona persona = data.save(p);
        if (!persona.equals(null)) {
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {

    }
}
