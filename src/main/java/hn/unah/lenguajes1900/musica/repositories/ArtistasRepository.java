package hn.unah.lenguajes1900.musica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.musica.entities.Artistas;
import java.util.List;
import hn.unah.lenguajes1900.musica.entities.Canciones;


@Repository
public interface ArtistasRepository extends CrudRepository<Artistas, Long> {
    
    
    public Artistas findByCanciones(List<Canciones> canciones);
}
