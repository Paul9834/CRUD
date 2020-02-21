package com.persona.ejemplo.release.interfaceService;

import com.persona.ejemplo.release.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface Interface_Persona_Servicio {

    public List<Persona> listar();

    public Optional<Persona>listarId(int id);

    public int save (Persona p);

    public void delete (int id);


}
