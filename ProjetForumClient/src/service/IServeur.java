package service;

import java.rmi.RemoteException;
import java.util.Set;

public interface IServeur {
	public ISujet obtientSujet(String s) throws RemoteException;
	
	public Set<String> ensembleSujets() throws RemoteException;
}
