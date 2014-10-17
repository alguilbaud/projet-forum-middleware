package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

public interface IServeur extends Remote{
	public Sujet obtientSujet(String s) throws RemoteException;
	
	public Set<String> ensembleSujets() throws RemoteException;
}
