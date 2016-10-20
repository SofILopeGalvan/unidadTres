package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compania")
public class Compania implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compania")
    private Long idCompania;
    @Column(length = 30)
    private String nombre;
    @Column(length = 50)
    private String ciudad;
    @Column(length = 30)
    private String ubicacion;

    public Compania() {
        this.idCompania = 0L;
    }

    public Long getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(Long idCompania) {
        this.idCompania= idCompania;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.ubicacion = Ubicacion;
    }

}
