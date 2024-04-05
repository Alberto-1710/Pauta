package hn.unah.lenguajes1900.musica.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.musica.entities.Artistas;
import hn.unah.lenguajes1900.musica.entities.Canciones;
import hn.unah.lenguajes1900.musica.repositories.ArtistasRepository;
import hn.unah.lenguajes1900.musica.repositories.CancionRepository;
import hn.unah.lenguajes1900.musica.services.CancionService;

@Service
public class CancionServiceImpl implements CancionService{

    @Autowired
    private CancionRepository cancionRepository;

    @Autowired
    private ArtistasRepository artistasRepository;

    @Override
    public List<Canciones> buscarCancion(long codigoArtista) {
        
        if(this.cancionRepository.existsById(codigoArtista)){
            return (List<Canciones>) this.cancionRepository.findById(codigoArtista).get();
        }
        return null;
        
    }

    @Override
    public Canciones crearCanciones(Canciones canciones) {
        return this.cancionRepository.save(canciones);
    }

    @Override
    public String eliminarCancion(long codigoCancion) {
        if(this.cancionRepository.findById(codigoCancion).isPresent()){
            this.cancionRepository.deleteById(codigoCancion);
            return "La cancion ha sido eliminada.";
        }
        return "La cancion no existe";
    }

    @Override
    public String asociarCancion(Canciones canciones) {
        
        Canciones nvaCancion = canciones;
        Artistas nvoArtista = nvaCancion.getArtistas();

        if(null!= this.cancionRepository.findById(nvaCancion.getCodigoCancion())){
            nvoArtista.setCodigoArtista(nvoArtista.getCodigoArtista());
            nvaCancion.getTitulo();
            nvaCancion.getAlbum();
            nvaCancion.getAnyolanzamiento();
            this.cancionRepository.save(nvaCancion);
            return "Cancion asignada exitosamente.";
        }
        return "Cancion no existe";


        
        
    }
    

}
