package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Recojo;

public interface IRecojoService {

	public void insert(Recojo r);
	public List<Recojo> list();
	public void delete(int id);
}
