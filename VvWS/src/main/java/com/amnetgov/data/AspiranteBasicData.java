package com.amnetgov.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "")
public class AspiranteBasicData{

	@XmlElement(required = true)
	private String tipoIdent;
	@XmlElement(required = true)
	private String numIdent;
	@XmlElement(required = true)
	private String primerApellido;
	@XmlElement(required = true)
	private String segundoApellido;
	@XmlElement(required = true)
	private String primerNombre;
	@XmlElement(required = true)
	private String segundoNombre;
	@XmlElement(required = true)
	private String fecNacimiento;
	@XmlElement(required = true)
	private String sexo;
	@XmlElement(required = true)
	private int grupoSanguineo;
	@XmlElement(required = true)
	private int servicio;
	@XmlElement(required = true)
	private int tramite;
	@XmlElement(required = true)
	private String categoria;
	@XmlElement(required = true)
	private int objectivo;
	@XmlElement(required = true)
	private int validacionManual;
	@XmlElement(required = true)
	private int segundoTramite;
	@XmlElement(required = true)
	private String segundaCategoria;
	@XmlElement(required = true)
	private String nombreAcompanante;
	@XmlElement(required = true)
	private String telAcompanante;
	@XmlElement(required = true)
	private String fecExpDocumento;
	@XmlElement(required = true)
	private String lugExpDocumento;
	@XmlElement(required = true)
	private String deptoResidencia;
	@XmlElement(required = true)
	private String muniResidencia;
	@XmlElement(required = true)
	private String direccion;
	@XmlElement(required = true)
	private String telefono;
	@XmlElement(required = true)
	private String mobile;
	@XmlElement(required = true)
	private String email;
	@XmlElement(required = true)
	private int gradoEscolaridad;
	@XmlElement(required = true)
	private String lugarNacimiento;
	@XmlElement(required = true)
	private int estadoCivil;
	@XmlElement(required = true)
	private int epsArs;
	@XmlElement(required = true)
	private int ocupacion;
	@XmlElement(required = true)
	private String ciudadNacimiento;
	@XmlElement(required = true)
	private String ciudadExpedicion;
	@XmlElement(required = true)
	private double estatura;
	@XmlElement(required = true)
	private String huellaIzg;
	@XmlElement(required = true)
	private String huellaDer;
	
		

	public String getHuella_izg() {
		return huellaIzg;
	}

	public void setHuella_izg(String huella_izg) {
		this.huellaIzg = huella_izg;
	}

	public String getHuella_der() {
		return huellaDer;
	}

	public void setHuella_der(String huella_der) {
		this.huellaDer = huella_der;
	}

	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}

	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}

	public String getCiudadExpedicion() {
		return ciudadExpedicion;
	}

	public void setCiudadExpedicion(String ciudadExpedicion) {
		this.ciudadExpedicion = ciudadExpedicion;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public int getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(int ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getEpsArs() {
		return epsArs;
	}

	public void setEpsArs(int epsArs) {
		this.epsArs = epsArs;
	}

	public int getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public AspiranteBasicData() {
	}

	public String getTipoIdent() {
		return tipoIdent;
	}

	public void setTipoIdent(String tipoIdent) {
		this.tipoIdent = tipoIdent;
	}

	public String getNumIdent() {
		return numIdent;
	}

	public void setNumIdent(String numIdent) {
		this.numIdent = numIdent;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(int grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public int getServicio() {
		return servicio;
	}

	public void setServicio(int servicio) {
		this.servicio = servicio;
	}

	public int getTramite() {
		return tramite;
	}

	public void setTramite(int tramite) {
		this.tramite = tramite;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getObjectivo() {
		return objectivo;
	}

	public void setObjectivo(int objectivo) {
		this.objectivo = objectivo;
	}

	public int getValidacionManual() {
		return validacionManual;
	}

	public void setValidacionManual(int validacionManual) {
		this.validacionManual = validacionManual;
	}

	public int getSegundoTramite() {
		return segundoTramite;
	}

	public void setSegundoTramite(int segundoTramite) {
		this.segundoTramite = segundoTramite;
	}

	public String getSegundaCategoria() {
		return segundaCategoria;
	}

	public void setSegundaCategoria(String segundaCategoria) {
		this.segundaCategoria = segundaCategoria;
	}

	public String getNombreAcompanante() {
		return nombreAcompanante;
	}

	public void setNombreAcompanante(String nombreAcompanante) {
		this.nombreAcompanante = nombreAcompanante;
	}

	public String getTelAcompanante() {
		return telAcompanante;
	}

	public void setTelAcompanante(String telAcompanante) {
		this.telAcompanante = telAcompanante;
	}

	public String getFecExpDocumento() {
		return fecExpDocumento;
	}

	public void setFecExpDocumento(String fecExpDocumento) {
		this.fecExpDocumento = fecExpDocumento;
	}

	public String getLugExpDocumento() {
		return lugExpDocumento;
	}

	public void setLugExpDocumento(String lugExpDocumento) {
		this.lugExpDocumento = lugExpDocumento;
	}

	public String getDeptoResidencia() {
		return deptoResidencia;
	}

	public void setDeptoResidencia(String deptoResidencia) {
		this.deptoResidencia = deptoResidencia;
	}

	public String getMuniResidencia() {
		return muniResidencia;
	}

	public void setMuniResidencia(String muniResidencia) {
		this.muniResidencia = muniResidencia;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGradoEscolaridad() {
		return gradoEscolaridad;
	}

	public void setGradoEscolaridad(int gradoEscolaridad) {
		this.gradoEscolaridad = gradoEscolaridad;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

}
