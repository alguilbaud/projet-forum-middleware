package client;

import javax.swing.JTextArea;

public class AfficheurClient implements InterfaceAfficheur {
	public JTextArea messages;
	
	public void affiche(String msg) {
		messages.setText(messages.getText() + "\n" + msg);
	}

}
