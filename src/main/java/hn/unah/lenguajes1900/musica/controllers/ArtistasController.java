package hn.unah.lenguajes1900.musica.controllers;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.musica.entities.Artistas;
import hn.unah.lenguajes1900.musica.entities.InformacionContacto;
import hn.unah.lenguajes1900.musica.services.impl.ArtistasServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/pauta")
public class ArtistasController {
    
    @Autowired
    private ArtistasServiceImpl artistasServiceImpl;

    @PostMapping("/artista/crear")
    public Artistas crearArtistas(@RequestBody Artistas artistas){
        return this.artistasServiceImpl.crearArtista(artistas);
    }

    @DeleteMapping("/artista/eliminar")
    public String elimarArtistas(@RequestParam long codigoArtista){
        return this.artistasServiceImpl.eliminarArtista(codigoArtista);
    }

    @PutMapping("/artista/actualizarDireccion")
    public InformacionContacto actualizarDireccion(@RequestParam long codigoArtista, @RequestBody InformacionContacto informacionContacto){
        return this.artistasServiceImpl.actualizarDireccion(informacionContacto, codigoArtista);
    }

    @GetMapping("/artista/buscar/{codigoArtista}")
    public Optional<Artistas> buscArtista(@PathVariable long codigoArtista) {
        return this.artistasServiceImpl.buscarArtista(codigoArtista);
    }
    
    @GetMapping("/artista/obtener")
    public List<Artistas> obtenerArtistas() {
        return this.artistasServiceImpl.obtenerArtistas();
    }
    @GetMapping("/artista/obtenerporcancion")
    public Artistas obtenerArtistasporCancion(@RequestParam String titulo) {
    return this.artistasServiceImpl.obteneArtistasPorCancion(titulo);

    
}
}