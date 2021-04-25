package com.umg.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	// Hace el llamado a persistence.xml
	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory==null) {
			factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME); // Si no es null, conectese a la BD
		}
		return factory;				
	}
	public static void shutdown() {
		if (factory!=null) {
			factory.close(); // Si no está apagada ya, entonces apáguela
		}		
	}
	
}