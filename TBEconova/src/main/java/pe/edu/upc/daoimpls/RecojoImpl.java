package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.RecojoDao;
import pe.edu.upc.entities.Recojo;

public class RecojoImpl implements RecojoDao {
	@PersistenceContext(unitName = "TBEconova")
	private EntityManager op;

	
	@Transactional
	@Override
	public void insert(Recojo r) {
		try {
			op.persist(r);
		} catch (Exception e) {
			System.out.println("Error al insertar recojo en DAO");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Recojo> list() {
		List<Recojo> listaRecojo = new ArrayList<Recojo>();
		try {
			Query jpql = op.createQuery("from Recojo r");
			listaRecojo = (List<Recojo>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de recojo");
		}
		
		return listaRecojo;
	}

	@Override
	@Transactional
	public void delete(int id) {
		try {
			Recojo rec = op.find(Recojo.class, id);
			op.remove(rec);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO");
		}
		
	}


	
}

