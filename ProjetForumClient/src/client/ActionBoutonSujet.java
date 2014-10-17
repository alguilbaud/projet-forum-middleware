package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

public class ActionBoutonSujet implements ActionListener{
	
	private ISujetC sujet;
	private AfficheurClient aff;
	private boolean ouvert;
	
	public ActionBoutonSujet (ISujetC suj){
		sujet = suj;
		ouvert = false;
	}

	public void actionPerformed(ActionEvent evt) {
		try {
			if(!ouvert){
				aff = new AfficheurClient(sujet);
				sujet.inscription(aff);
				
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
