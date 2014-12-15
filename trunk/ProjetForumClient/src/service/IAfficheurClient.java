package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAfficheurClient extends Remote {
	public void affiche(String msg) throws RemoteException;

}
