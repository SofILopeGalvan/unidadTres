package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vino")
public class Vino implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vino")
    private Long idVino;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String tipo;
    @Column(length = 30)
    private String marca;

    @ManyToOne
    @JoinColumn(name = "id_compania")
    private Compania compania;

    public Vino(Long idVino, String nombre, String tipo, String marca, Compania compania) {
        this.idVino = idVino;
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.compania = compania;
    }

    public Vino() {
        this.idVino = 0L;
    }

    public Long getIdVino() {
        return idVino;
    }

    public void setIdActriz(Long idVino) {
        this.idVino = idVino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCampania(Compania compania) {
        this.compania = compania;
    }

}
