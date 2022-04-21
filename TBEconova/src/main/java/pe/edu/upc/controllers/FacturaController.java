package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Factura;
import pe.edu.upc.serviceinterfaces.IFacturaService;

@Named
@RequestScoped
public class FacturaController {
	@Inject
	private IFacturaService fService;
	
	private Factura f;
	List<Factura> listaFacturas;
	
	@PostConstruct
	public void init() {
		this.listaFacturas = new ArrayList<Factura>();
		this.f = new Factura();
		this.list();
	}
	
	public String newConductor() {
		this.setF(new Factura());
		return "Factura.xhtml";
	}

	public void insert() {
		try {
			fService.insert(f);
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de Factura al insertar");
		}
	}
	
	public void list() {
		try {
			listaFacturas = fService.list();
		} catch (Exception e) {
			System.out.println("Error al listar facturas en el controller!!");
		}
	}
	
	public void delete(Factura fac) {
		try {
			fService.delete(fac.getIdFactura());
			list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador de factura" + e.getMessage());
		}
	}
	
	public Factura getF() {
		return f;
	}

	public void setF(Factura f) {
		this.f = f;
	}

	public List<Factura> getListaFactura() {
		return listaFacturas;
	}

	public void setListaFactura(List<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}
	
	
	
}
