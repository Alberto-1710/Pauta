package hn.unah.lenguajes1900.musica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "informacioncontacto")
@Data
public class InformacionContacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocontacto")
    private long codigoContacto;

    private String pais;

    private String ciudad;

    private String telefono;

    private String correo;

    @OneToOne(mappedBy = "informacioncontacto")
    @JsonIgnore
    private Artistas artistas;


}
