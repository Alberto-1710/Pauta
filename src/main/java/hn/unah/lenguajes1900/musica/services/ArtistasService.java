package hn.unah.lenguajes1900.musica.services;

import java.util.List;
import java.util.Optional;

//import java.util.Optional;

import hn.unah.lenguajes1900.musica.entities.Artistas;
import hn.unah.lenguajes1900.musica.entities.InformacionContacto;

public interface ArtistasService {

    public Artistas crearArtista(Artistas artistas);

    public String eliminarArtista(long codigoArtista);
    
    public InformacionContacto actualizarDireccion(InformacionContacto informacionContacto, long codigoArtista);

    public Optional<Artistas> buscarArtista(long codigoArtista);

    public List<Artistas> obtenerArtistas();

    public Artistas obteneArtistasPorCancion(String titulo);


}
