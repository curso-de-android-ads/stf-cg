package stf.gestordemandas.servico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdutorEntityManager {

    
    private EntityManagerFactory emfLocal;
    private EntityManager entityManagerLocal;
    
    private static ProdutorEntityManager instancia;

    private ProdutorEntityManager() {
    }

    public static ProdutorEntityManager getInstancia() {
        if (instancia == null) {
            instancia = new ProdutorEntityManager();
        }
        return instancia;
    }

    public EntityManager getEmLocal() {
        if (emfLocal == null) {
            emfLocal = Persistence.createEntityManagerFactory("gestor-demandas");
        }
        
        if (entityManagerLocal == null || !entityManagerLocal.isOpen()) {
            entityManagerLocal = emfLocal.createEntityManager();
        }
        
        
        return entityManagerLocal;
    }

   


}