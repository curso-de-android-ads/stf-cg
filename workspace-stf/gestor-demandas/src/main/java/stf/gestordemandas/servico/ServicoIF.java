package stf.gestordemandas.servico;

import java.util.List;

/**
 *
 * @author Witalo Carlos
 * @param <T>
 */
public interface ServicoIF<T>{

    
    /**
     * Cria um registro de uma entidade na base de dados.
     * @param entidade
     */
    public void criar(T entidade);
    
    /**
     * Modifica um registro de uma entidade na base de dados.
     * @param entidade
     */
    public void editar(T entidade);
    
    /**
     * Remove um registro de uma entidade na base de dados.
     * @param entidade
     */
    public void remover(T entidade);
    

    /**
     * Busca um registro de uma entidade na base de dados através do id.
     * @param id 
     * @return entidade do tipo Persistivel
     */
    public T buscarPorId(Long id);
    
    
     /**
     * Busca todos os registros de uma entidade na base de dados.
     * @return entidade do tipo Persistivel
     */
    public List<T> buscarTodos();

}