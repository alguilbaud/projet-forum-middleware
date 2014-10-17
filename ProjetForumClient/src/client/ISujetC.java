package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISujetC extends Remote {

	public void diffuser(String message) throws RemoteException;
	
	public void inscription(IAfficheurClient aff);
	
	public void desinscription(IAfficheurClient aff);
	
	public String getNom() throws RemoteException;
}
