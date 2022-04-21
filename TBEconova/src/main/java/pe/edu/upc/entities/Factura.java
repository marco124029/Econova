package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Factura")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idFactura;
	@Column(name = "planElejido", nullable = false, length = 39)
	private String planElejido;
	@Column(name = "monto", nullable = false)
	private double monto;
	@Column(name = "pagoPendiente", nullable = false)
	private double pagoPendiente;
	@Column(name = "pagoRealizado", nullable = false)
	private double pagoRealizado;
	@Column(name = "fechaPago", nullable = false)
	private Date fechaPago;
	@Column(name = "fechaIntervalo", nullable = false)
	private Date fechaIntervalo;

	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factura(int idFactura, String planElejido, double monto, double pagoPendiente, double pagoRealizado,
			Date fechaPago, Date fechaIntervalo) {
		super();
		this.idFactura = idFactura;
		this.planElejido = planElejido;
		this.monto = monto;
		this.pagoPendiente = pagoPendiente;
		this.pagoRealizado = pagoRealizado;
		this.fechaPago = fechaPago;
		this.fechaIntervalo = fechaIntervalo;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getPlanElejido() {
		return planElejido;
	}

	public void setPlanElejido(String planElejido) {
		this.planElejido = planElejido;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getPagoPendiente() {
		return pagoPendiente;
	}

	public void setPagoPendiente(double pagoPendiente) {
		this.pagoPendiente = pagoPendiente;
	}

	public double getPagoRealizado() {
		return pagoRealizado;
	}

	public void setPagoRealizado(double pagoRealizado) {
		this.pagoRealizado = pagoRealizado;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Date getFechaIntervalo() {
		return fechaIntervalo;
	}

	public void setFechaIntervalo(Date fechaIntervalo) {
		this.fechaIntervalo = fechaIntervalo;
	}

}
