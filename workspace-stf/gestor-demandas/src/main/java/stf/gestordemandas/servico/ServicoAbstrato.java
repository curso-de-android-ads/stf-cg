package stf.gestordemandas.servico;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.RollbackException;

import stf.gestordemandas.persistencia.DaoIF;

public abstract class ServicoAbstrato<T> implements ServicoIF<T> {

    protected static final Logger logger = Logger.getLogger(ServicoAbstrato.class.getName());

	

    public abstract DaoIF<T> getDao();

    public ServicoAbstrato() {
        
    }

    public abstract void setDao(DaoIF<T> dao);


    protected EntityManager getEntityManager() {
        return ProdutorEntityManager.getInstancia().getEmLocal();
    }

    @Override
    public void criar(T entidade) {
        try {
            GerenciadorTransacao.abrirTransacao(getDao().getEntityManager());
            getDao().criar(entidade);
            GerenciadorTransacao.executarTransacao(getDao().getEntityManager());
        } catch (IllegalStateException| RollbackException | IllegalArgumentException e) {

            GerenciadorTransacao.rollbackTransacao(getDao().getEntityManager());
            Logger.getLogger(ServicoAbstrato.class.getName()).log(Level.SEVERE, "Rollback na Camada Serviço: {0}", e.getMessage());

            if (e instanceof IllegalArgumentException) {
                throw new IllegalArgumentException("O objeto não pode ser nulo.");
            } else if (e instanceof IllegalStateException) {
                throw new IllegalStateException("Transação não pôde ser iniciada");
            } else if (e instanceof RollbackException) {
                throw new RollbackException("Rollback");
            }

        }

    }

    @Override
    public void editar(T entidade) {
        try {
            GerenciadorTransacao.abrirTransacao(getDao().getEntityManager());
            getDao().editar(entidade);
            GerenciadorTransacao.executarTransacao(getDao().getEntityManager());
        } catch (IllegalStateException | RollbackException | IllegalArgumentException e) {

            GerenciadorTransacao.rollbackTransacao(getDao().getEntityManager());
            Logger.getLogger(ServicoAbstrato.class.getName()).log(Level.SEVERE, "Exception na Camada Serviço: {0}", e.getMessage());
            
            if (e instanceof IllegalArgumentException) {
                throw new IllegalArgumentException("O objeto não pode ser nulo.");
            } else if (e instanceof IllegalStateException) {
                throw new IllegalStateException("Transação não pôde ser iniciada");
            } else if (e instanceof RollbackException) {
                throw new RollbackException("Rollback");
            }
            
        }
    }

    @Override
    public void remover(T entidade) {
        try {
            GerenciadorTransacao.abrirTransacao(getDao().getEntityManager());
            getDao().remover(entidade);
            GerenciadorTransacao.executarTransacao(getDao().getEntityManager());
        } catch (IllegalStateException | RollbackException | IllegalArgumentException e) {

            GerenciadorTransacao.rollbackTransacao(getDao().getEntityManager());
            Logger.getLogger(ServicoAbstrato.class.getName()).log(Level.SEVERE, "Exception na Camada Serviço: {0}", e.getMessage());

            if (e instanceof IllegalArgumentException) {
                throw new IllegalArgumentException("O objeto não pode ser nulo.");
            } else if (e instanceof IllegalStateException) {
                throw new IllegalStateException("Transação não pôde ser iniciada");
            } else if (e instanceof RollbackException) {
                throw new RollbackException("Rollback");
            }
            
        }

    }

    @Override
    public T buscarPorId(Long id) {
        return (T) getDao().buscarPorId(id);
    }

    @Override
    public abstract List<T> buscarTodos();

}