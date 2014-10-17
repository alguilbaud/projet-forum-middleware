package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServeur extends Remote{
	public Sujet obtientSujet(String s) throws RemoteException;
}
