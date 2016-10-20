package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Vino;


public class VinoDAO  extends DAO<Vino>{

    public VinoDAO() {
        super(new Vino());
    }    
     public Vino getOneById(Vino vino) throws HibernateException {
        return super.getOneById(vino.getIdVino()); 
    }
    
}
