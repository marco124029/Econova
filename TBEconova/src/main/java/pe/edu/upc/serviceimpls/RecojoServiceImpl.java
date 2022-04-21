package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.RecojoDao;
import pe.edu.upc.entities.Recojo;
import pe.edu.upc.serviceinterfaces.IRecojoService;

@Named
public class RecojoServiceImpl implements IRecojoService {

	@Inject
	private RecojoDao rDao;
	
	@Override
	public void insert(Recojo r) {
		// TODO Auto-generated method stub
		rDao.insert(r);
	}

	@Override
	public List<Recojo> list() {
		// TODO Auto-generated method stub
		return rDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rDao.delete(id);
	}

}
