package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class Vendedor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String vendedor;
	private String nombre;
	private String direccion;
	private String telefono;
	private String identificacion;
	private String comision;
	private String ruta;
	private String clidesnormal;
	private String clides1;
	private String clides2;
	private String clides3;
	private String turno;
	private String otnumero;
	private String idusuario;
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getClidesnormal() {
		return clidesnormal;
	}
	public void setClidesnormal(String clidesnormal) {
		this.clidesnormal = clidesnormal;
	}
	public String getClides1() {
		return clides1;
	}
	public void setClides1(String clides1) {
		this.clides1 = clides1;
	}
	public String getClides2() {
		return clides2;
	}
	public void setClides2(String clides2) {
		this.clides2 = clides2;
	}
	public String getClides3() {
		return clides3;
	}
	public void setClides3(String clides3) {
		this.clides3 = clides3;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getOtnumero() {
		return otnumero;
	}
	public void setOtnumero(String otnumero) {
		this.otnumero = otnumero;
	}
	public String getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}
	
}
