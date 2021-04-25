package com.umg.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.umg.model.JPAUtil;
import com.umg.model.Paciente;

public class PacienteDAO implements Serializable {

	// Vamos a utilizar métodos de hibernate, para ello debemos crear un objeto entity
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	/**
	 * Crea un nuevo registro en la base de datos de tipo Paciente.
	 * @param paciente
	 */
	public void savePatient(Paciente paciente) {
		entity.getTransaction().begin(); // Iniciamos la transacción en la BD
		entity.persist(paciente); // Registramos
		entity.getTransaction().commit(); // Guardamos y cerramos la BD
	}
	
	/**
	 * Permite editar los datos de un registro.
	 * @param paciente
	 */
	public void editPatient(Paciente paciente) {
		try {
			entity.getTransaction().begin();
			entity.merge(paciente); // Efectuamos la edición
			entity.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
//		finally {
//			JPAUtil.shutdown();
//		}
	}
	
	/**
	 * Busca a un paciente por su id.	
	 * @param id 
	 * @return
	 */
	public Paciente findPatient(Long id) {
		Paciente p = new Paciente();
		try {
			p = entity.find(Paciente.class, id); // Buscamos por su id
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
		return p;
	}
	
	/**
	 * Obtiene todos los registros dentro de la base de datos.
	 * @return
	 */
	public List<Paciente> getPatients() {
		List<Paciente> listaPacientes = new ArrayList<>();
		try {
			Query q = entity.createQuery("SELECT p FROM Paciente p"); // Sentencia JQL
			listaPacientes = q.getResultList();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return listaPacientes;
	}
	
	/**
	 * Busca al paciente por id para eliminarlo.
	 * @param id
	 */
	public void deletePatient(Long id) {
		Paciente p = new Paciente();
		try {
			p = entity.find(Paciente.class, id);
			entity.getTransaction().begin();
			entity.remove(p);
			entity.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
