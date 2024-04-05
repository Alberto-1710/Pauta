package hn.unah.lenguajes1900.musica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.musica.entities.InformacionContacto;
import hn.unah.lenguajes1900.musica.services.impl.InfoContactoServiceImpl;

@RestController
@RequestMapping("/pauta")
public class InfoContactoController {
    
    @Autowired
    private InfoContactoServiceImpl infoContactoServiceImpl;

    
    
    
}
