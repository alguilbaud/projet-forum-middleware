package service;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

public class ActionBoutonSujet implements ActionListener{
	
	private ISujet sujet;
	private Afficheur aff;
	
	public ActionBoutonSujet (ISujet suj){
		sujet = suj;
		aff = null;
	}

	public void actionPerformed(ActionEvent evt) {
		try {
			if(aff!=null && aff.ouvert){
				aff.fermer();
			}
			else{
				aff = new Afficheur(sujet);
				sujet.inscription(aff);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
