package hn.unah.lenguajes1900.musica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.musica.entities.InformacionContacto;

@Repository
public interface InfoContactoRepository extends CrudRepository<InformacionContacto, Long>{
    

}
