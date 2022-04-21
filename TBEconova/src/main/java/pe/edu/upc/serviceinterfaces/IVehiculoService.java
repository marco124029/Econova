package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Vehiculo;

public interface IVehiculoService {

	public void insert(Vehiculo v);
	public List<Vehiculo> list();
	public void delete(int id);
}
