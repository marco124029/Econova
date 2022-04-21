package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Recojo")
public class Recojo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRecojo;
	@Column(name = "capacidadOcupada",nullable = false)
	private double capacidadOcupada;
	@Column(name = "capacidadDesocupada",nullable = false)
	private double capacidadDesocupada;
	@Column(name = "diasDisponibles",nullable = false)
	private int diasDisponibles;
	@Column(name = "recojoautomatico",nullable = false)
	private boolean recojoautomatico;

	public Recojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recojo(int idRecojo, double capacidadOcupada, double capacidadDesocupada, int diasDisponibles,
			boolean recojoautomatico) {
		super();
		this.idRecojo = idRecojo;
		this.capacidadOcupada = capacidadOcupada;
		this.capacidadDesocupada = capacidadDesocupada;
		this.diasDisponibles = diasDisponibles;
		this.recojoautomatico = recojoautomatico;
	}

	public int getIdRecojo() {
		return idRecojo;
	}

	public void setIdRecojo(int idRecojo) {
		this.idRecojo = idRecojo;
	}

	public double getCapacidadOcupada() {
		return capacidadOcupada;
	}

	public void setCapacidadOcupada(double capacidadOcupada) {
		this.capacidadOcupada = capacidadOcupada;
	}

	public double getCapacidadDesocupada() {
		return capacidadDesocupada;
	}

	public void setCapacidadDesocupada(double capacidadDesocupada) {
		this.capacidadDesocupada = capacidadDesocupada;
	}

	public int getDiasDisponibles() {
		return diasDisponibles;
	}

	public void setDiasDisponibles(int diasDisponibles) {
		this.diasDisponibles = diasDisponibles;
	}

	public boolean isRecojoautomatico() {
		return recojoautomatico;
	}

	public void setRecojoautomatico(boolean recojoautomatico) {
		this.recojoautomatico = recojoautomatico;
	}

}
