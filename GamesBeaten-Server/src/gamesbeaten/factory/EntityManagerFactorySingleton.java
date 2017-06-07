package gamesbeaten.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	private static EntityManagerFactory factory = null;
	
	private EntityManagerFactorySingleton(){}
	
	public static EntityManagerFactory pegarInstancia(){
		if(factory == null){
			factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}		
		return factory;
	}
}
