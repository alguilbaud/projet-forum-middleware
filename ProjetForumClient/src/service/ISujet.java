package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISujet extends Remote {

	public void diffuser(String message) throws RemoteException;
}
