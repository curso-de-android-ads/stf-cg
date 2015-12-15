package stf.gestordemandas.persistencia;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author WitaloCarlos
 * @param <T>
 */
public class Dao<T> implements DaoIF<T> {

    private Class<T> entidade;
    protected static final Logger logger = Logger.getGlobal();
    private EntityManager entityManager;

    public Dao(Class<T> entidade, EntityManager entityManager) {
        this.entidade = entidade;
        this.entityManager = entityManager;
    }



    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void criar(T entidade) {
        logger.log(Level.INFO, "Criar");
        getEntityManager().persist(entidade);

    }

    @Override
    public void editar(T entidade) {
        logger.log(Level.INFO, "Editar");
        getEntityManager().merge(entidade);

    }

 

    @Override
    public T buscarPorId(Long id) {
        logger.log(Level.INFO, "Busca por Id {0}", id);
        T entity = getEntityManager().find(this.entidade, id);
        return entity;
    }

    @Override
    public List<T> consultar(String namedQuery, String[] parametros, Object[] valores) {

        Query query = getEntityManager().createNamedQuery(namedQuery, entidade);

        if (parametros != null && valores != null) {
            if (parametros.length == valores.length) {
                

                for (int i = 0; i < parametros.length; i++) {

                    query.setParameter(parametros[i], valores[i]);

                }
                

                return query.getResultList();
                
                
            } else {
                throw new DaoConsultarException("As listas de parametros e valores não possuem tamanhos iguais.");
            }
        } else {
            throw new DaoConsultarException("As listas de parametros e/ou valores não devem ser nulas.");
        }

    }

    @Override
    public List<T> consultar(String namedQuery) {
        if (namedQuery != null) {

            Query query = getEntityManager().createNamedQuery(namedQuery, entidade);
            return query.getResultList();

        } else {
            throw new DaoConsultarException("O valor namedQuery não pode ser nulo.");
        }

    }



	@Override
	public void remover(T entidade) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Deletar");
        entidade = getEntityManager().merge(entidade);
        getEntityManager().remove(entidade);
	}



	@Override
	public List<T> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}