package com.umg.controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import com.umg.dao.PacienteDAO;
import com.umg.model.Paciente;

@ManagedBean (name="pacienteBean")
@RequestScoped
public class PacienteBean implements Serializable {
	
	// Este archivo recibirá todas las peticiones del navegador
	// Con requestScoped le daremos un ámbito de petición y estará pendiente

	private static final long serialVersionUID = 1L;
	private boolean estado;
	
	@PostConstruct
	public void init() {
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	/**
	 * Consultamos los datos que hay dentro de la base de datos para mostrarlo en el index
	 * @return
	 */
	public List<Paciente> obtenerPacientes() {
		PacienteDAO pacienteDAO = new PacienteDAO();
		return pacienteDAO.getPatients();
	}
	
	/**
	 * Al ser presionado el botón "Editar", obtenemos el id y lo retornamos.
	 * @param id
	 * @return
	 */
	public String editarPaciente(Long id) {
		PacienteDAO pacienteDAO = new PacienteDAO();
		Paciente p = new Paciente();
		p = pacienteDAO.findPatient(id);
		setEstado(false);
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap(); // Con esto persistirá todo el tiempo que exista la aplicación
		sessionMap.put("paciente", p);
		return "/faces/registro.xhtml";
	}
	
	/**
	 * Guarda los cambios que haya hecho el usuario en la vista registro.xhtml
	 * @param paciente
	 * @return
	 * @throws InterruptedException 
	 */
	public String actualizarORegistrar(Paciente paciente) throws InterruptedException {
		
		Thread.sleep(3000);
		
		if (paciente.getIdpaciente() != null) {
			PacienteDAO pacienteDAO = new PacienteDAO();
			pacienteDAO.editPatient(paciente);
			return "/faces/registro.xhtml";
		}
		
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.savePatient(paciente);
		return "/faces/index.xhtml";
	}
	
	/**
	 * Nos devuelve a la pantalla index.html
	 * @return
	 */
	public String regresarAIndex() {
		return "/faces/index.xhtml";
	}
	
	public String eliminar(Long id) throws InterruptedException {
		Thread.sleep(3000);
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.deletePatient(id);
		return regresarAIndex();
	}
	
	/**
	 * Nos redirije de la pantalla index a una de registro
	 * @return
	 */
	public String registrarPaciente() {
		setEstado(true);
		Paciente p = new Paciente();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap(); // Con esto persistirá todo el tiempo que exista la aplicación
		sessionMap.put("paciente", p);
		return "/faces/registro.xhtml"; 
	}
	
	public void saludar() {
		System.out.println("holaaaaaaaaaaaaaaa");
	}
}
