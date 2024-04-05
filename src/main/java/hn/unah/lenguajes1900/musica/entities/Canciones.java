package hn.unah.lenguajes1900.musica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "canciones")
@Data
public class Canciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocancion")
    private long codigoCancion;

    private String titulo;

    private String album;

    private long anyolanzamiento;

    @ManyToOne
    @JoinColumn(name = "codigoartista", referencedColumnName = "codigoartista")
    private Artistas artistas;


}
