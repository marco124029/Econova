package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Recojo;

public interface RecojoDao {
	public void insert(Recojo r);
	public List<Recojo> list();
	public void delete(int id);
}
