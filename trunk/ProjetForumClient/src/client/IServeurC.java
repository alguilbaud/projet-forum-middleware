package client;

import java.rmi.RemoteException;
import java.util.Set;

public interface IServeurC {
	public ISujetC obtientSujet(String s) throws RemoteException;
		
	public Set<String> ensembleSujets() throws RemoteException;
}
