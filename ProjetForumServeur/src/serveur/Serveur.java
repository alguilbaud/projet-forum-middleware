package serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class Serveur extends UnicastRemoteObject implements IServeur{
	HashMap<String,Sujet> mapSujets;
	
	public Serveur() throws RemoteException{
		super();
		mapSujets = new HashMap<String,Sujet>();
		mapSujets.put("Sport", new Sujet("Sport"));
		mapSujets.put("Cinema", new Sujet("Cinema"));
		mapSujets.put("Musique", new Sujet("Musique"));
	}
	
	public Sujet obtientSujet(String s) throws RemoteException{
		return mapSujets.get(s);
	}
}
