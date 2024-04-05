package hn.unah.lenguajes1900.musica.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.musica.entities.Artistas;
import hn.unah.lenguajes1900.musica.entities.InformacionContacto;
import hn.unah.lenguajes1900.musica.repositories.ArtistasRepository;
import hn.unah.lenguajes1900.musica.repositories.InfoContactoRepository;
import hn.unah.lenguajes1900.musica.services.InfoContactoService;

@Service
public class InfoContactoServiceImpl implements InfoContactoService {

    @Autowired
    private ArtistasRepository artistasRepository;

    @Autowired
    private InfoContactoRepository infoContactoRepository;

    @Override
    public InformacionContacto actualizarDireccion(InformacionContacto informacionContacto, long codigoArtista) {
        Artistas obtenerDireccionArtistas = this.artistasRepository.findById(codigoArtista).get();
        InformacionContacto infoContactoRepository = new InformacionContacto();
        if(null!=obtenerDireccionArtistas){
            obtenerDireccionArtistas.getInformacioncontacto().equals(infoContactoRepository);
            infoContactoRepository.setPais(informacionContacto.getPais());
            infoContactoRepository.setCiudad(informacionContacto.getCiudad());
            infoContactoRepository.setTelefono(informacionContacto.getTelefono());
            infoContactoRepository.setCorreo(informacionContacto.getCorreo());
            this.infoContactoRepository.save(infoContactoRepository);
        }
        return infoContactoRepository;


    }

    
}
