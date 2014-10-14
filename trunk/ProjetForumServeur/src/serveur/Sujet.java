package serveur;

import java.io.Serializable;
import java.rmi.server.RemoteObject;
import java.util.LinkedList;

public class Sujet extends RemoteObject implements Serializable {
	private String nom;
	private LinkedList<Afficheur> listeAbonnes;
	
	public Sujet (String n){
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
	
	public synchronized void diffuse(String msg){
		for (Afficheur aff : listeAbonnes){
			aff.affiche(msg);
		}
	}
}
