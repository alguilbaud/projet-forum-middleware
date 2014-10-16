package serveur;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

public class Sujet extends UnicastRemoteObject implements ISujet {
	private String nom;
	private LinkedList<Afficheur> listeAbonnes;
	
	public Sujet (String n)throws RemoteException{
		nom = n;
		listeAbonnes = new LinkedList<Afficheur>();
	}

	public String getNom() {
		return nom;
	}
	
	public void inscription(Afficheur aff){
		listeAbonnes.add(aff);
	}
	
	public void desinscription(Afficheur aff){
		listeAbonnes.remove(aff);
	}
	
	public synchronized void diffuser(String msg){
		for (Afficheur aff : listeAbonnes){
			aff.affiche(msg);
		}
	}
	public static void main(String[] args) {
		 
         try {
        	 LocateRegistry.createRegistry(8099);
             Sujet sujet = new Sujet("Sport");
			 Naming.rebind("rmi://localhost:8099/sujet", sujet);
			 System.out.println(sujet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
