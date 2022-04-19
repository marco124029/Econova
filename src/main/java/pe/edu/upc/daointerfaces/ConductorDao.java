package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Conductor;

public interface ConductorDao {
	public void insert(Conductor p);
	public List<Conductor> list();
	public void delete(int id);
}
