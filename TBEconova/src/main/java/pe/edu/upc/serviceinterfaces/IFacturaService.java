package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Factura;

public interface IFacturaService {
	public void insert(Factura f);
	public List<Factura> list();
	public void delete(int id);
}
