package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Factura;

public interface FacturaDao {
	public void insert(Factura f);
	public List<Factura> list();
	public void delete(int id);
}
