package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class DetallePedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String codigoProducto;
	private String caja;
	private String unidad;
	private float precio;
	private String descripcion;
	private String bonificacion;
	private String presentacion;
	private String existencia;
	private float precio1;
	private float precio2;
	private float precio3;
	private String unidadesCaja;
	private String subTotal;
	private int totalUnidades;
	private float precioSeleccionado;
	private int sinc;
	private String codigoPedido;
	
	
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getCaja() {
		return caja;
	}
	public void setCaja(String caja) {
		this.caja = caja;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUnidadesCaja() {
		return unidadesCaja;
	}
	public void setUnidadesCaja(String unidadesCaja) {
		this.unidadesCaja = unidadesCaja;
	}
	public String getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}
	public int getTotalUnidades() {
		return totalUnidades;
	}
	public void setTotalUnidades(int totalUnidades) {
		this.totalUnidades = totalUnidades;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPrecioSeleccionado() {
		return precioSeleccionado;
	}
	public void setPrecioSeleccionado(float precioSeleccionado) {
		this.precioSeleccionado = precioSeleccionado;
	}
	public float getPrecio1() {
		return precio1;
	}
	public void setPrecio1(float precio1) {
		this.precio1 = precio1;
	}
	public float getPrecio2() {
		return precio2;
	}
	public void setPrecio2(float precio2) {
		this.precio2 = precio2;
	}
	public float getPrecio3() {
		return precio3;
	}
	public void setPrecio3(float precio3) {
		this.precio3 = precio3;
	}
	public void setSinc(int sinc) {
		this.sinc = sinc;
	}
	public int getSinc() {
		return sinc;
	}
	public String getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public String getExistencia() {
		return existencia;
	}
	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public String getBonificacion() {
		return bonificacion;
	}
	public void setBonificacion(String bonificacion) {
		this.bonificacion = bonificacion;
	}
}
