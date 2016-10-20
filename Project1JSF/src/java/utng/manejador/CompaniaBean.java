package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.CompaniaDAO;
import utng.modelo.Compania;

@ManagedBean
@SessionScoped
public class CompaniaBean implements Serializable {

    private List<Compania> companias;
    private Compania compania;

    public CompaniaBean() {
    }

    public List<Compania> getCompanias() {
        return companias;
    }

    public void setCompanias(List<Compania> companias) {
        this.companias = companias;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public String listar() {
        CompaniaDAO dao = new CompaniaDAO();
        try {
            companias = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Companias";
    }

    public String eliminar() {
        CompaniaDAO dao = new CompaniaDAO();
        try {
            dao.delete(compania);
            companias = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar() {
        compania = new Compania();
        return "Iniciar";
    }

    public String guardar() {
        CompaniaDAO dao = new CompaniaDAO();
        try {
            if (compania.getIdCompania()!= 0) {
                dao.update(compania);
            } else {
                dao.insert(compania);
            }
            companias = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Compania compania) {
        this.compania = compania;
        return "Editar";
    }

}
