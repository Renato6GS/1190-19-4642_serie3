package com.umg.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="paciente")
public class Paciente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idpaciente;
	@Column
	private String tipo_de_solicitud;
	@Column
	private String no_de_afiliacion;
	@Column
	private String nit;
	public String getTipo_de_solicitud() {
		return tipo_de_solicitud;
	}
	@Column
	private String dia_nacimiento;
	@Column
	private String mes_nacimiento;
	@Column
	private String anio_nacimiento;
	@Column
	private String nombres;
	@Column
	private String apellidos;
	@Column
	private String telefono;
	@Column
	private String sexo;
	@Column
	private String estado_civil;
	@Column
	private String grupo_etnico;
	@Column
	private String nacionalidad;
	@Column
	private String cui;
	@Column
	private String departamento;
	@Column
	private String municipio;
	@Column
	private String direccion;
	@Column
	private String nombres_padre;
	@Column
	private String nombres_madre;
	@Column
	private String apellidos_padre;
	@Column
	private String apellidos_madre;
	@Column
	private String telefono_padre;
	@Column
	private String telefono_madre;
	
	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getTelefono_padre() {
		return telefono_padre;
	}


	public void setTelefono_padre(String telefono_padre) {
		this.telefono_padre = telefono_padre;
	}


	public String getTelefono_madre() {
		return telefono_madre;
	}


	public void setTelefono_madre(String telefono_madre) {
		this.telefono_madre = telefono_madre;
	}

	public void setTipo_de_solicitud(String tipo_de_solicitud) {
		this.tipo_de_solicitud = tipo_de_solicitud;
	}


	public String getDia_nacimiento() {
		return dia_nacimiento;
	}


	public void setDia_nacimiento(String dia_nacimiento) {
		this.dia_nacimiento = dia_nacimiento;
	}


	public String getMes_nacimiento() {
		return mes_nacimiento;
	}


	public void setMes_nacimiento(String mes_nacimiento) {
		this.mes_nacimiento = mes_nacimiento;
	}


	public String getAnio_nacimiento() {
		return anio_nacimiento;
	}


	public void setAnio_nacimiento(String anio_nacimiento) {
		this.anio_nacimiento = anio_nacimiento;
	}


	public Long getIdpaciente() {
		return idpaciente;
	}


	public void setIdpaciente(Long idpaciente) {
		this.idpaciente = idpaciente;
	}


	public String getTipo_de_consulta() {
		return tipo_de_solicitud;
	}


	public void setTipo_de_consulta(String tipo_de_consulta) {
		this.tipo_de_solicitud = tipo_de_consulta;
	}


	public String getNo_de_afiliacion() {
		return no_de_afiliacion;
	}


	public void setNo_de_afiliacion(String no_de_afiliacion) {
		this.no_de_afiliacion = no_de_afiliacion;
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getEstado_civil() {
		return estado_civil;
	}


	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}


	public String getGrupo_etnico() {
		return grupo_etnico;
	}


	public void setGrupo_etnico(String grupo_etnico) {
		this.grupo_etnico = grupo_etnico;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getCui() {
		return cui;
	}


	public void setCui(String cui) {
		this.cui = cui;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getMunicipio() {
		return municipio;
	}


	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombres_padre() {
		return nombres_padre;
	}


	public void setNombres_padre(String nombres_padre) {
		this.nombres_padre = nombres_padre;
	}


	public String getNombres_madre() {
		return nombres_madre;
	}


	public void setNombres_madre(String nombres_madre) {
		this.nombres_madre = nombres_madre;
	}


	public String getApellidos_padre() {
		return apellidos_padre;
	}


	public void setApellidos_padre(String apellidos_padre) {
		this.apellidos_padre = apellidos_padre;
	}


	public String getApellidos_madre() {
		return apellidos_madre;
	}


	public void setApellidos_madre(String apellidos_madre) {
		this.apellidos_madre = apellidos_madre;
	}


	@Override
	public String toString() {
		return "Paciente [idpaciente=" + idpaciente + ", tipo_de_solicitud=" + tipo_de_solicitud + ", no_de_afiliacion="
				+ no_de_afiliacion + ", nit=" + nit + ", dia_nacimiento=" + dia_nacimiento + ", mes_nacimiento="
				+ mes_nacimiento + ", anio_nacimiento=" + anio_nacimiento + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", telefono=" + telefono + ", sexo=" + sexo + ", estado_civil=" + estado_civil
				+ ", grupo_etnico=" + grupo_etnico + ", nacionalidad=" + nacionalidad + ", cui=" + cui
				+ ", departamento=" + departamento + ", municipio=" + municipio + ", direccion=" + direccion
				+ ", nombres_padre=" + nombres_padre + ", nombres_madre=" + nombres_madre + ", apellidos_padre="
				+ apellidos_padre + ", apellidos_madre=" + apellidos_madre + ", telefono_padre=" + telefono_padre
				+ ", telefono_madre=" + telefono_madre + ", getTipo_de_solicitud()=" + getTipo_de_solicitud()
				+ ", getDia_nacimiento()=" + getDia_nacimiento() + ", getMes_nacimiento()=" + getMes_nacimiento()
				+ ", getAnio_nacimiento()=" + getAnio_nacimiento() + ", getTelefono()=" + getTelefono()
				+ ", getTelefono_padre()=" + getTelefono_padre() + ", getTelefono_madre()=" + getTelefono_madre()
				+ ", getIdpaciente()=" + getIdpaciente() + ", getTipo_de_consulta()=" + getTipo_de_consulta()
				+ ", getNo_de_afiliacion()=" + getNo_de_afiliacion() + ", getNit()=" + getNit() + ", getNombres()="
				+ getNombres() + ", getApellidos()=" + getApellidos() + ", getSexo()=" + getSexo()
				+ ", getEstado_civil()=" + getEstado_civil() + ", getGrupo_etnico()=" + getGrupo_etnico()
				+ ", getNacionalidad()=" + getNacionalidad() + ", getCui()=" + getCui() + ", getDepartamento()="
				+ getDepartamento() + ", getMunicipio()=" + getMunicipio() + ", getDireccion()=" + getDireccion()
				+ ", getNombres_padre()=" + getNombres_padre() + ", getNombres_madre()=" + getNombres_madre()
				+ ", getApellidos_padre()=" + getApellidos_padre() + ", getApellidos_madre()=" + getApellidos_madre()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

