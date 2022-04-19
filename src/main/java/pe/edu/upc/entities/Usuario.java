package pe.edu.upc.entities;

import java.util.Date;

public class Usuario {

	private int idUsuario;
	private String Usuario;
	private String Contrasena;
	private String nombreEmpresa;
	private String nombre;
	private String apellido;
	private String dni;
	private String Correo;
	private String nroCelular;
	private Date fechaNacimiento;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, String usuario, String contrasena, String nombreEmpresa, String nombre,
			String apellido, String dni, String correo, String nroCelular, Date fechaNacimiento) {
		super();
		this.idUsuario = idUsuario;
		Usuario = usuario;
		Contrasena = contrasena;
		this.nombreEmpresa = nombreEmpresa;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		Correo = correo;
		this.nroCelular = nroCelular;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getNroCelular() {
		return nroCelular;
	}

	public void setNroCelular(String nroCelular) {
		this.nroCelular = nroCelular;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
