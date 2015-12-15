package stf.gestordemandas.persistencia;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

/**
 * 
 * @author Witalo Carlos
 *
 * @param <T>
 */
public interface DaoIF<T> extends Serializable{

	/**
	 * Cria um registro de uma entidade na base de dados.
	 * 
	 * @param entidade
	 */
	void criar(T entidade);

	/**
	 * Modifica um registro de uma entidade na base de dados.
	 * 
	 * @param entidade
	 */
	void editar(T entidade);

	/**
	 * Remove um registro de uma entidade na base de dados.
	 * 
	 * @param entidade
	 */
	void remover(T entidade);

	/**
	 * Busca um registro de uma entidade na base de dados através do id.
	 * 
	 * @param id
	 * @return entidade do tipo Persistivel
	 */
	T buscarPorId(Long id);

	/**
	 * Busca todos os registros de uma determinada tabela/colecao;
	 * 
	 * @return lista de resultados da consulta
	 */
	List<T> buscarTodos();

	List<T> consultar(String namedQuery);

	List<T> consultar(String namedQuery, String[] parametros, Object[] valores);

	EntityManager getEntityManager();

}
