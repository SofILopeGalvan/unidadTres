package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.VinoDAO;
import utng.datos.CompaniaDAO;
import utng.modelo.Vino;
import utng.modelo.Compania;

@ManagedBean 
@SessionScoped
public class VinoBean implements Serializable{
    private List<Vino> vinos;
    private Vino vino;
    private List<Compania> companias;
    
    public VinoBean(){
        vino = new Vino();
        vino.setCampania(new Compania());
    }

    public List<Vino> getVinos() {
        return vinos;
    }

    public void setVinos(List<Vino> vinos) {
        this.vinos = vinos;
    }

    public Vino getVino() {
        return vino;
    }

    public void setVino(Vino vino) {
        this.vino = vino;
    }

    public List<Compania> getCompanias() {
        return companias;
    }

    public void setCompanias(List<Compania> companias) {
        this.companias = companias;
    }
    
       public String listar(){
        VinoDAO dao = new VinoDAO();
        try {
            vinos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Vinos";
    }
       
       public String eliminar(){
      VinoDAO dao = new VinoDAO();
        try {
            dao.delete(vino);
            vinos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        vino= new Vino();
        vino.setCampania(new Compania());
        try {
            companias= new CompaniaDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }
    
    public String guardar(){
         VinoDAO dao = new VinoDAO();
        try {
            if(vino.getIdVino()!= 0){
                dao.update(vino);
            }else {
                dao.insert(vino);
            }
            vinos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Vino vino){
        this.vino=vino;
        try {
            companias = new CompaniaDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }    
}
