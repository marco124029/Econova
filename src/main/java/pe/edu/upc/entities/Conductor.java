package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Conductor")
public class Conductor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "nombreConductor", nullable = false, length = 30)
	private String nombreConductor;
	@Column(name = "apellidoConductor", nullable = false, length = 30)
	private String apellidoConductor;

	public Conductor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conductor(int id, String nombreConductor, String apellidoConductor) {
		super();
		this.id = id;
		this.nombreConductor = nombreConductor;
		this.apellidoConductor = apellidoConductor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	public String getApellidoConductor() {
		return apellidoConductor;
	}

	public void setApellidoConductor(String apellidoConductor) {
		this.apellidoConductor = apellidoConductor;
	}

	
}
