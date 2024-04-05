package hn.unah.lenguajes1900.musica.services.impl;

import java.util.List;
import java.util.Optional;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.musica.entities.Artistas;
import hn.unah.lenguajes1900.musica.entities.Canciones;
import hn.unah.lenguajes1900.musica.entities.InformacionContacto;
import hn.unah.lenguajes1900.musica.repositories.ArtistasRepository;
import hn.unah.lenguajes1900.musica.repositories.CancionRepository;
import hn.unah.lenguajes1900.musica.repositories.InfoContactoRepository;
import hn.unah.lenguajes1900.musica.services.ArtistasService;

@Service
public class ArtistasServiceImpl implements ArtistasService {

    @Autowired
    private ArtistasRepository artistasRepository;

    @Autowired
    private InfoContactoRepository infoContactoRepository;

    @Autowired
    private CancionRepository cancionRepository;

    @Override
    public Artistas crearArtista(Artistas artistas) {
      return this.artistasRepository.save(artistas);
    }

    @Override
    public String eliminarArtista(long codigoArtista) {
        if(this.artistasRepository.findById(codigoArtista).isPresent()){
            this.artistasRepository.deleteById(codigoArtista);
            return "Artista eliminado exitosamente.";
        }
        return "El artista no existe";
    }

        public InformacionContacto actualizarDireccion(InformacionContacto informacionContacto, long codigoArtista) {

        Artistas obtenerDireccion = this.artistasRepository.findById(codigoArtista).get();
        InformacionContacto actualizarDireccion = obtenerDireccion.getInformacioncontacto();

        if(null!= obtenerDireccion){
            
            actualizarDireccion.setPais(informacionContacto.getPais());
            actualizarDireccion.setCiudad(informacionContacto.getCiudad());
            actualizarDireccion.setTelefono(informacionContacto.getTelefono());
            actualizarDireccion.setCorreo(informacionContacto.getCorreo());
            this.infoContactoRepository.save(actualizarDireccion);
        }
        return actualizarDireccion;
    }
    
    @Override
    public Optional<Artistas> buscarArtista(long codigoArtista) {
        return this.artistasRepository.findById(codigoArtista);
    }

    @Override
    public List<Artistas> obtenerArtistas() {
       return (List<Artistas>) this.artistasRepository.findAll();
    }


    @Override
    public Artistas obteneArtistas(String titulo) {
        Canciones canciones = this.cancionRepository.findByTitulo(titulo);
        return this.artistasRepository.findByCanciones(canciones);
    }


}


 /*@Override
    public Artistas actualizarDireccion(Artistas artistas, long codigoArtista) {

        Artistas nvaDireccion = this.artistasRepository.findById(codigoArtista).get();

        if(null!= nvaDireccion){
            //nvaDireccion.setInformacioncontacto(artistas.getInformacioncontacto());
            
            this.artistasRepository.save(nvaDireccion);
        }
        return nvaDireccion;
    }*/