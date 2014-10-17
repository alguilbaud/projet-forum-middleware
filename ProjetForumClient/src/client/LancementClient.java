package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Set;

public class LancementClient {

	public static void main(String[] args) {
		 if (System.getSecurityManager() == null) {
			 System.setSecurityManager(new SecurityManager());
		 }
		 try {
			 String name = "Serveur";
			 Registry registry = LocateRegistry.getRegistry();
			 IServeurC serveur = (IServeurC) registry.lookup(name);
	     
	     
			 Set<String> nomSujets = serveur.ensembleSujets();
			 
			 //à finir
			 /*IClient stub1 = (IClient) UnicastRemoteObject.exportObject(client1, 0);
			 chat.addClient(stub1);*/
		 } catch(Exception e){
			 e.printStackTrace();
		 }
	}

}
