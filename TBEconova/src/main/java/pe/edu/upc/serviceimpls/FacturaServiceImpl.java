package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerfaces.FacturaDao;
import pe.edu.upc.entities.Factura;
import pe.edu.upc.serviceinterfaces.IFacturaService;

public class FacturaServiceImpl implements IFacturaService {

	@Inject
	private FacturaDao fDao;
	
	@Override
	public void insert(Factura f) {
		fDao.insert(f);
	}

	@Override
	public List<Factura> list() {
		return fDao.list();
	}

	@Override
	public void delete(int id) {
		fDao.delete(id);
	}

}
