package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ConductorDao;
import pe.edu.upc.entities.Conductor;

public class ConductorImpl implements ConductorDao {
	@PersistenceContext(unitName = "TBEconova")
	private EntityManager op;

	@Transactional
	@Override
	public void insert(Conductor p) {
		try {
			op.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar persona en DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Conductor> list() {
		List<Conductor> listaConductor = new ArrayList<Conductor>();
		try {
			// JPQL
			Query jpql = op.createQuery("from Conductor p");
			listaConductor = (List<Conductor>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de persona");
		}
		return listaConductor;
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		try {
			Conductor con = op.find(Conductor.class, id);
			op.remove(con);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO");
		}
	}
	
	
}
 
