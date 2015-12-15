package stf.gestordemandas.controlador;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import stf.gestordemandas.modelo.Gerente;
import stf.gestordemandas.servico.ServicoGerente;
import stf.gestordemandas.servico.ServicoIF;


@RequestScoped
@Path("/gerentes")
public class ControladorGerente extends ControladorAbstrato<Gerente>{

	private ServicoIF<Gerente> servico;
	
	
	
	
	public ControladorGerente() {
		super();
		this.servico = new ServicoGerente();
	}




	@Override
	public ServicoIF<Gerente> getServico() {
		// TODO Auto-generated method stub
		return servico;
	}
	
	

}
