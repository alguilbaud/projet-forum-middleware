package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class LancementServeur {
	
	public static void main(String[] args) {
        try {
        	LocateRegistry.createRegistry(8099);
        	Serveur serveur = new Serveur();
			Naming.rebind("rmi://localhost:8099/serveur", serveur);
			System.out.println(serveur);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
