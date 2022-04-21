package pe.edu.upc.entities;

public class Seguimiento {
	private int idSeguimiento;
	private String ubicacion;
	private String CoordenadaUbicacion;
	private int tiempollegada;

	public Seguimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seguimiento(int idSeguimiento, String ubicacion, String coordenadaUbicacion, int tiempollegada) {
		super();
		this.idSeguimiento = idSeguimiento;
		this.ubicacion = ubicacion;
		CoordenadaUbicacion = coordenadaUbicacion;
		this.tiempollegada = tiempollegada;
	}

	public int getIdSeguimiento() {
		return idSeguimiento;
	}

	public void setIdSeguimiento(int idSeguimiento) {
		this.idSeguimiento = idSeguimiento;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCoordenadaUbicacion() {
		return CoordenadaUbicacion;
	}

	public void setCoordenadaUbicacion(String coordenadaUbicacion) {
		CoordenadaUbicacion = coordenadaUbicacion;
	}

	public int getTiempollegada() {
		return tiempollegada;
	}

	public void setTiempollegada(int tiempollegada) {
		this.tiempollegada = tiempollegada;
	}

}
