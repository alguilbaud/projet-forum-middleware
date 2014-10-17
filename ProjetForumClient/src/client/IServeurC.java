package client;

import java.rmi.RemoteException;
import java.util.Set;

public interface IServeurC {
	public ISujet obtientSujet(String s) throws RemoteException;
	
	public Set<String> ensembleSujets() throws RemoteException;
}
