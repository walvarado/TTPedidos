package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class Portafolio implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String idPortafolio;
	private String descripcion;
	private String fechacreacion;
	private String deshabilitar;
	private String anotaciones;
	private String usuario;
	public String getIdPortafolio() {
		return idPortafolio;
	}
	public void setIdPortafolio(String idPortafolio) {
		this.idPortafolio = idPortafolio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getDeshabilitar() {
		return deshabilitar;
	}
	public void setDeshabilitar(String deshabilitar) {
		this.deshabilitar = deshabilitar;
	}
	public String getAnotaciones() {
		return anotaciones;
	}
	public void setAnotaciones(String anotaciones) {
		this.anotaciones = anotaciones;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
