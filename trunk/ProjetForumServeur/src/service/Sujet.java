package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

public class Sujet extends UnicastRemoteObject implements ISujet {
	private String nom;
	private LinkedList<IAfficheur> listeAbonnes;
	
	public Sujet (String n)throws RemoteException{
		super();
		nom = n;
		listeAbonnes = new LinkedList<IAfficheur>();
	}

	public String getNom() {
		return nom;
	}
	
	public void inscription(IAfficheur aff){
		listeAbonnes.add(aff);
	}
	
	public void desinscription(IAfficheur aff){
		listeAbonnes.remove(aff);
	}
	
	public synchronized void diffuser(String msg){
		try{
			for (IAfficheur aff : listeAbonnes){
				aff.affiche(msg);
			}
		}
		catch (RemoteException e){
			e.printStackTrace();
		}
	}
}
