package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OuvrirFenetreSujet implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	   new IHMSujet(((JButton)(e.getSource())).getLabel());
		
	}

}
