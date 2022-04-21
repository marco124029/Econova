package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Vehiculo;
import pe.edu.upc.serviceinterfaces.IVehiculoService;

@Named
@RequestScoped
public class VehiculoController {
	@Inject
	private IVehiculoService vService;

	private Vehiculo v;
	List<Vehiculo> listaVehiculos;

	@PostConstruct
	public void init() {
		this.listaVehiculos = new ArrayList<Vehiculo>();
		this.v = new Vehiculo();
		this.list();
	}

	public String newVehiculo() {
		this.setV(new Vehiculo());
		return "Vehiculo.xhtml";
	}

	public void insert() {
		try {
			vService.insert(v);
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de vehiculo al insertar");
		}
	}

	public void list() {
		try {
			listaVehiculos = vService.list();
		} catch (Exception e) {
			System.out.println("Error al listar vehiculos en el controller!!");
		}
	}
	
	public void delete(Vehiculo ve) {
		try {
			vService.delete(ve.getIdVehiculo());
			list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador de vehiculo" + e.getMessage());
		}
	}

	public Vehiculo getV() {
		return v;
	}

	public void setV(Vehiculo v) {
		this.v = v;
	}

	public List<Vehiculo> getListaVehiculo() {
		return listaVehiculos;
	}

	public void setListaVehiculo(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

}
