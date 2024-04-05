package hn.unah.lenguajes1900.musica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.musica.entities.Canciones;
import hn.unah.lenguajes1900.musica.services.impl.CancionServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/pauta")
public class CancionController {
    
    @Autowired
    private CancionServiceImpl cancionServiceImpl;

    @GetMapping("/cancion/buscar")
    public List<Canciones> buscarCancion(@RequestParam long codigoArtista) {
        return this.cancionServiceImpl.buscarCancion(codigoArtista);
    }

    @PostMapping("/cancion/crear")
    public Canciones crearCanciones(@RequestBody Canciones canciones) {      
        return this.cancionServiceImpl.crearCanciones(canciones);
    }
    
    @DeleteMapping("/cancion/eliminar")
    public String eliminarCancion(@RequestParam long codigoCancion){
        return this.cancionServiceImpl.eliminarCancion(codigoCancion);
    }

    @PutMapping("/cancion/asociar")
    public String asociarCancion(@RequestBody Canciones canciones) {      
        return this.cancionServiceImpl.asociarCancion(canciones);
    }
}
