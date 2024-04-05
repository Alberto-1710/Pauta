package hn.unah.lenguajes1900.musica.services;

import hn.unah.lenguajes1900.musica.entities.InformacionContacto;

public interface InfoContactoService {
    
    public InformacionContacto actualizarDireccion(InformacionContacto informacionContacto, long codigoArtista);

}
