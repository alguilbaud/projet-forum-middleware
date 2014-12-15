package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

public interface IServeur extends Remote{
	public ISujet obtientSujet(String s) throws RemoteException;
	
	public Set<String> ensembleSujets() throws RemoteException;
}
