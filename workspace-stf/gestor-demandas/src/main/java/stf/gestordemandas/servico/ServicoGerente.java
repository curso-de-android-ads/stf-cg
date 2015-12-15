package stf.gestordemandas.servico;

import java.util.List;

import stf.gestordemandas.modelo.Gerente;
import stf.gestordemandas.persistencia.Dao;
import stf.gestordemandas.persistencia.DaoIF;

public class ServicoGerente extends ServicoAbstrato<Gerente> implements ServicoGerenteIF{

	private DaoIF<Gerente> mDao;
	
	public ServicoGerente() {
		this.mDao = new Dao<>(Gerente.class, getEntityManager()); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public DaoIF<Gerente> getDao() {
		// TODO Auto-generated method stub
		return mDao;
	}

	@Override
	public void setDao(DaoIF<Gerente> dao) {
		this.mDao = dao;
		
	}

	@Override
	public List<Gerente> buscarTodos() {
		// TODO Auto-generated method stub
		return getDao().consultar("Gerente.buscarTodos");
	}

}
