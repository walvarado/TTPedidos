package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class Ruta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String descripcion;
	private String tipovehiculo;
	private String origen;
	private String destino;
	private String precioventa;
	private String combustible;
	private String viaticos;
	private String otrosgastos;
	private String kilometros;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipovehiculo() {
		return tipovehiculo;
	}
	public void setTipovehiculo(String tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getPrecioventa() {
		return precioventa;
	}
	public void setPrecioventa(String precioventa) {
		this.precioventa = precioventa;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public String getViaticos() {
		return viaticos;
	}
	public void setViaticos(String viaticos) {
		this.viaticos = viaticos;
	}
	public String getOtrosgastos() {
		return otrosgastos;
	}
	public void setOtrosgastos(String otrosgastos) {
		this.otrosgastos = otrosgastos;
	}
	public String getKilometros() {
		return kilometros;
	}
	public void setKilometros(String kilometros) {
		this.kilometros = kilometros;
	}
	
}
