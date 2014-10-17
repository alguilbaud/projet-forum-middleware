package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISujet extends Remote {

	public void diffuser(String message) throws RemoteException;
	
	public void inscription(IAfficheur aff);
	
	public void desinscription(IAfficheur aff);
	
	public String getNom() throws RemoteException;
}
