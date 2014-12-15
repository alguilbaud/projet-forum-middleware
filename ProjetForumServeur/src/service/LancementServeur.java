package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class LancementServeur {

	/*public static void main(String[] args) {
		try {
			Sujet sport = new Sujet("Sport");
			Sujet cinema = new Sujet("Cinéma");
			Sujet musique = new Sujet("Musique");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//créer rmi
	}*/
	
	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
        try {
        	LocateRegistry.createRegistry(8099);
        	Sujet sujet = new Sujet("Sport");
			Naming.rebind("rmi://localhost:8099/sujet", sujet);
			System.out.println(sujet);
            //IServeur stubServeur = (IServeur) UnicastRemoteObject.exportObject(serveur, 0);
			//Registry registry = LocateRegistry.getRegistry();
			//registry.rebind("Serveur", stubServeur);
			//System.out.println("Chat bound");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
