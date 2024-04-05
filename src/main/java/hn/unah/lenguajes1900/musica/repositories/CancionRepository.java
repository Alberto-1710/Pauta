package hn.unah.lenguajes1900.musica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.musica.entities.Canciones;


@Repository
public interface CancionRepository extends CrudRepository<Canciones, Long>{
    
    public Canciones findByTitulo(String titulo);
}
