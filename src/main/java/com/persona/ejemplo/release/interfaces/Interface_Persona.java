package com.persona.ejemplo.release.interfaces;

import com.persona.ejemplo.release.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Interface_Persona extends CrudRepository<Persona, Integer> {


}
