package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ConductorDao;
import pe.edu.upc.entities.Conductor;
import pe.edu.upc.serviceinterfaces.IConductorService;

@Named
public class ConductorServiceImpl implements IConductorService{
	
	@Inject
	private ConductorDao cDao;
	
	@Override
	public void insert(Conductor p) {
		// TODO Auto-generated method stub
		cDao.insert(p);
	}

	@Override
	public List<Conductor> list() {
		// TODO Auto-generated method stub
		return cDao.list();
	}
	
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cDao.delete(id);
	}
	

}
