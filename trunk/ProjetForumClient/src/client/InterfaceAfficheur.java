package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceAfficheur extends Remote {
	public void affiche(String msg) throws RemoteException;

}
