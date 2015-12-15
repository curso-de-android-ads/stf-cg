package stf.gestordemandas.controlador;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import stf.gestordemandas.modelo.Demanda;
import stf.gestordemandas.servico.ServicoDemanda;
import stf.gestordemandas.servico.ServicoIF;



@RequestScoped
@Path("/demandas")
public class ControladorDemanda extends ControladorAbstrato<Demanda>{

	private ServicoIF<Demanda> servico;
	
	
	
	
	public ControladorDemanda() {
		super();
		this.servico = new ServicoDemanda();
	}




	@Override
	public ServicoIF<Demanda> getServico() {
		// TODO Auto-generated method stub
		return servico;
	}
	
	

}
