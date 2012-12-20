package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String cliCodigo;
	private String cliEmpresa;
	private String cliContacto;
	private String codCatCliete;
	private String cliDireccion;
	private String cliTelefono;
	private String cliFax;
	private String cliEmail;
	private String cliWeb;
	private String fingreso;
	private String cliDesnormal;
	private String cliDes1;
	private String cliDes2;
	private String cliDes3;
	private String cliLimite;
	private String cliSaldo;
	private String cliCheque;
	private String cliRuta;
	private String cliDireccionParticular;
	private String cliTelefonoCasa;
	private String cliTelefonoMovil;
	private String cliNit;
	private int Semana;
	private String diaVisita;
	private boolean visitado;
	private RespuestaWS respuesta;
	public String getCliCodigo() {
		return cliCodigo;
	}
	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}
	public String getCliEmpresa() {
		return cliEmpresa;
	}
	public void setCliEmpresa(String cliEmpresa) {
		this.cliEmpresa = cliEmpresa;
	}
	public String getCliContacto() {
		return cliContacto;
	}
	public void setCliContacto(String cliContacto) {
		this.cliContacto = cliContacto;
	}
	public String getCodCatCliete() {
		return codCatCliete;
	}
	public void setCodCatCliete(String codCatCliete) {
		this.codCatCliete = codCatCliete;
	}
	public String getCliDireccion() {
		return cliDireccion;
	}
	public void setCliDireccion(String cliDireccion) {
		this.cliDireccion = cliDireccion;
	}
	public String getCliTelefono() {
		return cliTelefono;
	}
	public void setCliTelefono(String cliTelefono) {
		this.cliTelefono = cliTelefono;
	}
	public String getCliFax() {
		return cliFax;
	}
	public void setCliFax(String cliFax) {
		this.cliFax = cliFax;
	}
	public String getCliEmail() {
		return cliEmail;
	}
	public void setCliEmail(String cliEmail) {
		this.cliEmail = cliEmail;
	}
	public String getCliWeb() {
		return cliWeb;
	}
	public void setCliWeb(String cliWeb) {
		this.cliWeb = cliWeb;
	}
	public String getFingreso() {
		return fingreso;
	}
	public void setFingreso(String fingreso) {
		this.fingreso = fingreso;
	}
	public String getCliDesnormal() {
		return cliDesnormal;
	}
	public void setCliDesnormal(String cliDesnormal) {
		this.cliDesnormal = cliDesnormal;
	}
	public String getCliDes1() {
		return cliDes1;
	}
	public void setCliDes1(String cliDes1) {
		this.cliDes1 = cliDes1;
	}
	public String getCliDes2() {
		return cliDes2;
	}
	public void setCliDes2(String cliDes2) {
		this.cliDes2 = cliDes2;
	}
	public String getCliDes3() {
		return cliDes3;
	}
	public void setCliDes3(String cliDes3) {
		this.cliDes3 = cliDes3;
	}
	public String getCliLimite() {
		return cliLimite;
	}
	public void setCliLimite(String cliLimite) {
		this.cliLimite = cliLimite;
	}
	public String getCliSaldo() {
		return cliSaldo;
	}
	public void setCliSaldo(String cliSaldo) {
		this.cliSaldo = cliSaldo;
	}
	public String getCliCheque() {
		return cliCheque;
	}
	public void setCliCheque(String cliCheque) {
		this.cliCheque = cliCheque;
	}
	public String getCliRuta() {
		return cliRuta;
	}
	public void setCliRuta(String cliRuta) {
		this.cliRuta = cliRuta;
	}
	public String getCliDireccionParticular() {
		return cliDireccionParticular;
	}
	public void setCliDireccionParticular(String cliDireccionParticular) {
		this.cliDireccionParticular = cliDireccionParticular;
	}
	public String getCliTelefonoCasa() {
		return cliTelefonoCasa;
	}
	public void setCliTelefonoCasa(String cliTelefonoCasa) {
		this.cliTelefonoCasa = cliTelefonoCasa;
	}
	public String getCliTelefonoMovil() {
		return cliTelefonoMovil;
	}
	public void setCliTelefonoMovil(String cliTelefonoMovil) {
		this.cliTelefonoMovil = cliTelefonoMovil;
	}
	public String getCliNit() {
		return cliNit;
	}
	public void setCliNit(String cliNit) {
		this.cliNit = cliNit;
	}
	public int getSemana() {
		return Semana;
	}
	public void setSemana(int semana) {
		Semana = semana;
	}
	public String getDiaVisita() {
		return diaVisita;
	}
	public void setDiaVisita(String diaVisita) {
		this.diaVisita = diaVisita;
	}
	public boolean isVisitado() {
		return visitado;
	}
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	public RespuestaWS getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(RespuestaWS respuesta) {
		this.respuesta = respuesta;
	}
}
