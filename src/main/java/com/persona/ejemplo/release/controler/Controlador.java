package com.persona.ejemplo.release.controler;

import com.persona.ejemplo.release.modelo.Persona;
import com.persona.ejemplo.release.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private PersonaService service;

    @GetMapping("/lista")
    public String listar (Model model) {

        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar (Model model) {
        model.addAttribute("persona", new Persona());
        return "form";
    }

@PostMapping("/save")
    public String save (@Valid Persona p, Model model) {
        service.save(p);
        return "redirect:/lista";
    }

}
