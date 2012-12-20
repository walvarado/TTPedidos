package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class Articulo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String artCodigo;
	private String artCodigoAlterno;
	private String categoria;
	private String sector;
	private String division;
	private String artDescripcion;
	private String artIngrediente;
	private float precioVenta;
	private float precioDes1;
	private float precioDes2;
	private float precioDes3;
	private boolean ofertado;
	private float precioOferta;
	private String foto;
	private String observaciones;
	private String catalogo;
	private int unidadesFardo;
	private String link;
	private String artOfertaFecha;
	private RespuestaWS respuesta;
	public String getArtCodigo() {
		return artCodigo;
	}
	public void setArtCodigo(String artCodigo) {
		this.artCodigo = artCodigo;
	}
	public String getArtCodigoAlterno() {
		return artCodigoAlterno;
	}
	public void setArtCodigoAlterno(String artCodigoAlterno) {
		this.artCodigoAlterno = artCodigoAlterno;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getArtDescripcion() {
		return artDescripcion;
	}
	public void setArtDescripcion(String artDescripcion) {
		this.artDescripcion = artDescripcion;
	}
	public String getArtIngrediente() {
		return artIngrediente;
	}
	public void setArtIngrediente(String artIngrediente) {
		this.artIngrediente = artIngrediente;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public float getPrecioDes1() {
		return precioDes1;
	}
	public void setPrecioDes1(float precioDes1) {
		this.precioDes1 = precioDes1;
	}
	public float getPrecioDes2() {
		return precioDes2;
	}
	public void setPrecioDes2(float precioDes2) {
		this.precioDes2 = precioDes2;
	}
	public float getPrecioDes3() {
		return precioDes3;
	}
	public void setPrecioDes3(float precioDes3) {
		this.precioDes3 = precioDes3;
	}
	public boolean isOfertado() {
		return ofertado;
	}
	public void setOfertado(boolean ofertado) {
		this.ofertado = ofertado;
	}
	public float getPrecioOferta() {
		return precioOferta;
	}
	public void setPrecioOferta(float precioOferta) {
		this.precioOferta = precioOferta;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(String catalogo) {
		this.catalogo = catalogo;
	}
	public int getUnidadesFardo() {
		return unidadesFardo;
	}
	public void setUnidadesFardo(int unidadesFardo) {
		this.unidadesFardo = unidadesFardo;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getArtOfertaFecha() {
		return artOfertaFecha;
	}
	public void setArtOfertaFecha(String artOfertaFecha) {
		this.artOfertaFecha = artOfertaFecha;
	}
	public RespuestaWS getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(RespuestaWS respuesta) {
		this.respuesta = respuesta;
	}
	
}
