package stf.gestordemandas.controlador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import stf.gestordemandas.servico.ServicoIF;



public abstract class ControladorAbstrato<T> {

	Logger logger = Logger.getGlobal();

	public abstract ServicoIF<T> getServico();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<T> getAllEmpresasInJSON() {

		return getServico().buscarTodos();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public T getUserById(@PathParam("id") Long id) {
		logger.log(Level.INFO, "Buscando");
		return getServico().buscarPorId(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public T create(T entidade) {

		logger.log(Level.INFO, "Salvando");
		getServico().criar(entidade);

		return entidade;
	}

	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public T update(T entidade) {
		logger.log(Level.INFO, "Editar");
		getServico().editar(entidade);

		return entidade;
	}

	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void remove(@PathParam("id") Long id) {
		T entidade = getServico().buscarPorId(id);

		getServico().remover(entidade);
	}
}
