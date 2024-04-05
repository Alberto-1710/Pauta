package hn.unah.lenguajes1900.musica.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "artistas")
@Data
public class Artistas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoartista")
    private long codigoArtista;

    private String nombreartistico;

    private String nombre;

    private String apellido;

    private LocalDate fechanacimiento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigocontacto", referencedColumnName = "codigocontacto")
    private InformacionContacto informacioncontacto;

    @OneToMany(mappedBy = "artistas")
    @JsonIgnore
    private List<Canciones>canciones;
    
}
