package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISujet extends Remote {

	public void diffuser(String message) throws RemoteException;
	
	public void inscription(IAfficheur aff) throws RemoteException;
	
	public void desinscription(IAfficheur aff) throws RemoteException;
	
	public String getNom() throws RemoteException;
}
