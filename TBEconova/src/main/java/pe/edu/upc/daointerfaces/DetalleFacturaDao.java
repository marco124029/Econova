package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.DetalleFactura;

public interface DetalleFacturaDao {
	public void insert(DetalleFactura p);
	public List<DetalleFactura> list();
	public void delete(int id);
}

