package stf.gestordemandas.servico;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class GerenciadorTransacao {

    private GerenciadorTransacao(){
    }
    
    public static void abrirTransacao(EntityManager entityManager) {
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
    }

    public static void executarTransacao(EntityManager entityManager) {
        entityManager.getTransaction().commit();
    }
    
    public static void encerrarTransacoes(EntityManager entityManager){
        entityManager.close();
    }

    public static void rollbackTransacao(EntityManager entity) {
        entity.getTransaction().rollback();
    }

}