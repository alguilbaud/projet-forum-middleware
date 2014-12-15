package service;

import java.rmi.RemoteException;

public interface IAfficheur{
	public void affiche(String msg) throws RemoteException;
}
