package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class EncabezadoPedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String codigoCliente;
	private float total;
	private String fecha;
	private String hora;
	private String efectivo;
	private String cheque;
	private String credito;
	private int fallido;
	private int motivo;
	private int sinc;
	private String motivoNoCompra;
	private String codigoPedidoTemp;
	
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getEfectivo() {
		return efectivo;
	}
	public void setEfectivo(String efectivo) {
		this.efectivo = efectivo;
	}
	public String getCheque() {
		return cheque;
	}
	public void setCheque(String cheque) {
		this.cheque = cheque;
	}
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public void setSinc(int sinc) {
		this.sinc = sinc;
	}
	public int getSinc() {
		return sinc;
	}
	public String getCodigoPedidoTemp() {
		return codigoPedidoTemp;
	}
	public void setCodigoPedidoTemp(String codigoPedidoTemp) {
		this.codigoPedidoTemp = codigoPedidoTemp;
	}
	public int getFallido() {
		return fallido;
	}
	public void setFallido(int fallido) {
		this.fallido = fallido;
	}
	public int getMotivo() {
		return motivo;
	}
	public void setMotivo(int motivo) {
		this.motivo = motivo;
	}
	public String getMotivoNoCompra() {
		return motivoNoCompra;
	}
	public void setMotivoNoCompra(String motivoNoCompra) {
		this.motivoNoCompra = motivoNoCompra;
	}
}
