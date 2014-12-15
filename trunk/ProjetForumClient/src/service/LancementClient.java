package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Set;

public class LancementClient {

	public static void main(String[] args) {
		 try {
			 IServeur serveur = (IServeur) Naming.lookup("rmi://localhost:8099/serveur");
			 System.out.println(serveur);
			 
		 } catch(Exception e){
			 e.printStackTrace();
		 }
	}

}
