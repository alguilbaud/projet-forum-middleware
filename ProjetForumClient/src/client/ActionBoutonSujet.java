package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

public class ActionBoutonSujet implements ActionListener{
	
	private ISujet sujet;
	private AfficheurClient aff;
	private boolean ouvert;
	
	public ActionBoutonSujet (ISujet suj){
		sujet = suj;
		ouvert = false;
	}

	public void actionPerformed(ActionEvent evt) {
		try {
			if(!ouvert){
				aff = new AfficheurClient(sujet);
				sujet.inscription(aff);
				ouvert = true;
			}
			else{
				aff.fermer();
				ouvert = false;
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
