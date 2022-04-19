package pe.edu.upc.entities;

public class DetalleSeguimiento {

	private String ubicacionAhora;
	private String ubicacionProxima;
	private String PuntoSalida;
	private String PuntoLlegada;

	public DetalleSeguimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleSeguimiento(String ubicacionAhora, String ubicacionProxima, String puntoSalida, String puntoLlegada) {
		super();
		this.ubicacionAhora = ubicacionAhora;
		this.ubicacionProxima = ubicacionProxima;
		PuntoSalida = puntoSalida;
		PuntoLlegada = puntoLlegada;
	}

	public String getUbicacionAhora() {
		return ubicacionAhora;
	}

	public void setUbicacionAhora(String ubicacionAhora) {
		this.ubicacionAhora = ubicacionAhora;
	}

	public String getUbicacionProxima() {
		return ubicacionProxima;
	}

	public void setUbicacionProxima(String ubicacionProxima) {
		this.ubicacionProxima = ubicacionProxima;
	}

	public String getPuntoSalida() {
		return PuntoSalida;
	}

	public void setPuntoSalida(String puntoSalida) {
		PuntoSalida = puntoSalida;
	}

	public String getPuntoLlegada() {
		return PuntoLlegada;
	}

	public void setPuntoLlegada(String puntoLlegada) {
		PuntoLlegada = puntoLlegada;
	}

}
