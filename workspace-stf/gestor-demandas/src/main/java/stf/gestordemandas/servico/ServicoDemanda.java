package stf.gestordemandas.servico;

import java.util.List;

import stf.gestordemandas.modelo.Demanda;
import stf.gestordemandas.persistencia.Dao;
import stf.gestordemandas.persistencia.DaoIF;

public class ServicoDemanda extends ServicoAbstrato<Demanda> implements ServicoDemandaIF{

	private DaoIF<Demanda> mDao;
	
	public ServicoDemanda() {
		this.mDao = new Dao<>(Demanda.class, getEntityManager()); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public DaoIF<Demanda> getDao() {
		// TODO Auto-generated method stub
		return mDao;
	}

	@Override
	public void setDao(DaoIF<Demanda> dao) {
		this.mDao = dao;
		
	}

	@Override
	public List<Demanda> buscarTodos() {
		// TODO Auto-generated method stub
		return getDao().consultar("Demanda.buscarTodos");
	}

}
