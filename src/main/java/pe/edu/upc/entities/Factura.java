package pe.edu.upc.entities;

import java.util.Date;

public class Factura {
	private int idFactura;
	private String planElejido;
	private double monto;
	private double pagoPendiente;
	private double pagoRealizado;
	private double fechaPago;
	private Date fechaIntervalo;

	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factura(int idFactura, String planElejido, double monto, double pagoPendiente, double pagoRealizado,
			double fechaPago, Date fechaIntervalo) {
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

	public double getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(double fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Date getFechaIntervalo() {
		return fechaIntervalo;
	}

	public void setFechaIntervalo(Date fechaIntervalo) {
		this.fechaIntervalo = fechaIntervalo;
	}

	
}
