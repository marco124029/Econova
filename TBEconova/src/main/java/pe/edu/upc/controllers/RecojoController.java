package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Recojo;
import pe.edu.upc.serviceinterfaces.IRecojoService;


@Named
@RequestScoped
public class RecojoController {
	@Inject
	private IRecojoService rService;
	
	private Recojo r;
	List<Recojo> listaRecojos;
	
	@PostConstruct
	public void init() {
		this.listaRecojos = new ArrayList<Recojo>();
		this.r = new Recojo();
		this.list();
	}

	public String newRecojo() {
		this.setR(new Recojo());
		return "Recojo.xhtml";
	}

	public void insert() {
		try {
			rService.insert(r);
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de recojo al insertar");
		}
	}

	public void list() {
		try {
			listaRecojos = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar recojo en el controller!!");
		}
	}
	
	public void delete(Recojo re) {
		try {
			rService.delete(re.getIdRecojo());
			list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador de recojo" + e.getMessage());
		}
	}

	public Recojo getR() {
		return r;
	}

	public void setR(Recojo r) {
		this.r = r;
	}

	public List<Recojo> getListaRecojo() {
		return listaRecojos;
	}

	public void setListaRecojos(List<Recojo> listaRecojos) {
		this.listaRecojos = listaRecojos;
	}

	
}
