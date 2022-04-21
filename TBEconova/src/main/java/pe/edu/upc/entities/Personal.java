package pe.edu.upc.entities;

public class Personal {
	private String nombrePersonal;
	private String apellidoPersonal;

	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personal(String nombrePersonal, String apellidoPersonal) {
		super();
		this.nombrePersonal = nombrePersonal;
		this.apellidoPersonal = apellidoPersonal;
	}

	public String getNombrePersonal() {
		return nombrePersonal;
	}

	public void setNombrePersonal(String nombrePersonal) {
		this.nombrePersonal = nombrePersonal;
	}

	public String getApellidoPersonal() {
		return apellidoPersonal;
	}

	public void setApellidoPersonal(String apellidoPersonal) {
		this.apellidoPersonal = apellidoPersonal;
	}

}
