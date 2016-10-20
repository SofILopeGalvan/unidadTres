package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Compania;

public class CompaniaDAO extends DAO<Compania>{

    public CompaniaDAO() {
        super(new Compania());
    }

    public Compania getOneById(Compania compania) throws HibernateException {
        return super.getOneById(compania.getIdCompania()); 
    }
    
    
    
    
}
