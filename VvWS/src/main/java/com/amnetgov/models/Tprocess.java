package com.amnetgov.models;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import java.sql.Timestamp;


/**
 * The persistent class for the tprocess database table.
 * 
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Tprocess implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long processId;

	private String categoria;

	private String certificador;

	private Long certificadorSeguimiento;

	private Long crcId;

	private String deptoResidencia;

	private String direccion;

	private String estado;

	private Timestamp fecCertification;

	private Date fecExpDocumento;

	private Timestamp fecRegistro;

	private Date fechaNacimiento;

	private String firma;

	private Integer gradoEscolaridad;

	private Integer grupoSanguineo;

	private String huellaDer;

	private String huellaIzq;

	private String lugExpDocumento;

	private String lugarNacimiento;

	private String muniResidencia;

	private String nombreAcompanante;

	private String numIdent;

	private Long numeroEvaluacion;

	private Integer objectivo;

	private String observations;

	private String photograph;

	private Long pin;

	private String primerApellido;

	private String primerNombre;

	private Integer resultadoExamen;

	private String segundaCategoria;

	private String segundoApellido;

	private String segundoNombre;

	private Integer segundoTramite;

	private Integer servicio;

	private String sexo;

	private String telefono;

	private String telefonoAcompanante;

	private String tipoIdent;

	private Integer tramite;

	private double valPayment;

	private Integer validacionManual;

	public Tprocess() {
	}

	public Long getProcessId() {
		return this.processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCertificador() {
		return this.certificador;
	}

	public void setCertificador(String certificador) {
		this.certificador = certificador;
	}

	public Long getCertificadorSeguimiento() {
		return this.certificadorSeguimiento;
	}

	public void setCertificadorSeguimiento(Long certificadorSeguimiento) {
		this.certificadorSeguimiento = certificadorSeguimiento;
	}

	public Long getCrcId() {
		return this.crcId;
	}

	public void setCrcId(Long crcId) {
		this.crcId = crcId;
	}

	public String getDeptoResidencia() {
		return this.deptoResidencia;
	}

	public void setDeptoResidencia(String deptoResidencia) {
		this.deptoResidencia = deptoResidencia;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Timestamp getFecCertification() {
		return this.fecCertification;
	}

	public void setFecCertification(Timestamp fecCertification) {
		this.fecCertification = fecCertification;
	}

	public Date getFecExpDocumento() {
		return this.fecExpDocumento;
	}

	public void setFecExpDocumento(Date fecExpDocumento) {
		this.fecExpDocumento = fecExpDocumento;
	}

	public Timestamp getFecRegistro() {
		return this.fecRegistro;
	}

	public void setFecRegistro(Timestamp fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFirma() {
		return this.firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public Integer getGradoEscolaridad() {
		return this.gradoEscolaridad;
	}

	public void setGradoEscolaridad(Integer gradoEscolaridad) {
		this.gradoEscolaridad = gradoEscolaridad;
	}

	public Integer getGrupoSanguineo() {
		return this.grupoSanguineo;
	}

	public void setGrupoSanguineo(Integer grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String getHuellaDer() {
		return this.huellaDer;
	}

	public void setHuellaDer(String huellaDer) {
		this.huellaDer = huellaDer;
	}

	public String getHuellaIzq() {
		return this.huellaIzq;
	}

	public void setHuellaIzq(String huellaIzq) {
		this.huellaIzq = huellaIzq;
	}

	public String getLugExpDocumento() {
		return this.lugExpDocumento;
	}

	public void setLugExpDocumento(String lugExpDocumento) {
		this.lugExpDocumento = lugExpDocumento;
	}

	public String getLugarNacimiento() {
		return this.lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getMuniResidencia() {
		return this.muniResidencia;
	}

	public void setMuniResidencia(String muniResidencia) {
		this.muniResidencia = muniResidencia;
	}

	public String getNombreAcompanante() {
		return this.nombreAcompanante;
	}

	public void setNombreAcompanante(String nombreAcompanante) {
		this.nombreAcompanante = nombreAcompanante;
	}

	public String getNumIdent() {
		return this.numIdent;
	}

	public void setNumIdent(String numIdent) {
		this.numIdent = numIdent;
	}

	public Long getNumeroEvaluacion() {
		return this.numeroEvaluacion;
	}

	public void setNumeroEvaluacion(Long numeroEvaluacion) {
		this.numeroEvaluacion = numeroEvaluacion;
	}

	public Integer getObjectivo() {
		return this.objectivo;
	}

	public void setObjectivo(Integer objectivo) {
		this.objectivo = objectivo;
	}

	public String getObservations() {
		return this.observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public String getPhotograph() {
		return this.photograph;
	}

	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}

	public Long getPin() {
		return this.pin;
	}

	public void setPin(Long pin) {
		this.pin = pin;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public Integer getResultadoExamen() {
		return this.resultadoExamen;
	}

	public void setResultadoExamen(Integer resultadoExamen) {
		this.resultadoExamen = resultadoExamen;
	}

	public String getSegundaCategoria() {
		return this.segundaCategoria;
	}

	public void setSegundaCategoria(String segundaCategoria) {
		this.segundaCategoria = segundaCategoria;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public Integer getSegundoTramite() {
		return this.segundoTramite;
	}

	public void setSegundoTramite(Integer segundoTramite) {
		this.segundoTramite = segundoTramite;
	}

	public Integer getServicio() {
		return this.servicio;
	}

	public void setServicio(Integer servicio) {
		this.servicio = servicio;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefonoAcompanante() {
		return this.telefonoAcompanante;
	}

	public void setTelefonoAcompanante(String telefonoAcompanante) {
		this.telefonoAcompanante = telefonoAcompanante;
	}

	public String getTipoIdent() {
		return this.tipoIdent;
	}

	public void setTipoIdent(String tipoIdent) {
		this.tipoIdent = tipoIdent;
	}

	public Integer getTramite() {
		return this.tramite;
	}

	public void setTramite(Integer tramite) {
		this.tramite = tramite;
	}

	public double getValPayment() {
		return this.valPayment;
	}

	public void setValPayment(double valPayment) {
		this.valPayment = valPayment;
	}

	public Integer getValidacionManual() {
		return this.validacionManual;
	}

	public void setValidacionManual(Integer validacionManual) {
		this.validacionManual = validacionManual;
	}

}