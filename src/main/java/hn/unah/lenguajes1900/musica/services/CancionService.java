package hn.unah.lenguajes1900.musica.services;

import java.util.List;

import hn.unah.lenguajes1900.musica.entities.Artistas;
import hn.unah.lenguajes1900.musica.entities.Canciones;

public interface CancionService {
    
    public List<Canciones> buscarCancion(long codigoArtista);

    public Canciones crearCanciones(Canciones canciones);

    public String eliminarCancion(long codigoCancion);

    public String asociarCancion(Canciones canciones);


}
