package pe.edu.upc.entities;

public class Vehiculo {
	private String modeloVehiculo;
	private String colorVehiculo;
	private String placaVehiculo;
	private double CapacidadVehiculo;

	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(String modeloVehiculo, String colorVehiculo, String placaVehiculo, double capacidadVehiculo) {
		super();
		this.modeloVehiculo = modeloVehiculo;
		this.colorVehiculo = colorVehiculo;
		this.placaVehiculo = placaVehiculo;
		CapacidadVehiculo = capacidadVehiculo;
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
