package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVehiculo;
	
	@Column(name = "modeloVehiculo", nullable = false, length = 15)
	private String modeloVehiculo;
	@Column(name = "colorVehiculo", nullable = false, length = 10)
	private String colorVehiculo;
	@Column(name = "placaVehiculo", nullable = false)
	private String placaVehiculo;
	@Column(name = "CapacidadVehiculo", nullable = false)
	private double CapacidadVehiculo;

	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(int idVehiculo, String modeloVehiculo, String colorVehiculo, String placaVehiculo,
			double capacidadVehiculo) {
		super();
		this.idVehiculo = idVehiculo;
		this.modeloVehiculo = modeloVehiculo;
		this.colorVehiculo = colorVehiculo;
		this.placaVehiculo = placaVehiculo;
		CapacidadVehiculo = capacidadVehiculo;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getModeloVehiculo() {
		return modeloVehiculo;
	}

	public void setModeloVehiculo(String modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

	public String getColorVehiculo() {
		return colorVehiculo;
	}

	public void setColorVehiculo(String colorVehiculo) {
		this.colorVehiculo = colorVehiculo;
	}

	public String getPlacaVehiculo() {
		return placaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}

	public double getCapacidadVehiculo() {
		return CapacidadVehiculo;
	}

	public void setCapacidadVehiculo(double capacidadVehiculo) {
		CapacidadVehiculo = capacidadVehiculo;
	}

	

}
 

