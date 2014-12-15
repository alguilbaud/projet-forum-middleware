package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISujetC extends Remote {

	public void diffuser(String message) throws RemoteException;
	
	public void inscription(IAfficheurClient aff) throws RemoteException;
	
	public void desinscription(IAfficheurClient aff) throws RemoteException;
	
	public String getNom() throws RemoteException;
}
