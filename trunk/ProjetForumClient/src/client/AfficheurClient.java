package client;

import java.awt.BorderLayout;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AfficheurClient extends UnicastRemoteObject implements InterfaceAfficheur {
	
	public JFrame fenetre;
	public JTextArea messages;
	
	
	public AfficheurClient() throws RemoteException {
		super();
		fenetre = new JFrame();
		fenetre.setTitle(nom); //On donne un titre à l'application
		fenetre.setSize(320,320); //On donne une taille à notre fenêtre
		fenetre.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		fenetre.setResizable(false) ; //On interdit la redimensionnement de la fenêtre
		fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //On dit à l'application de se fermer
		BorderLayout borderLayout=new BorderLayout();
		JTextArea messages= new JTextArea();
		messages.setEditable(false);
		JTextField message= new JTextField();
		JButton envoyer= new JButton("envoyer");
		JPanel panel= new JPanel();
		JPanel panelSouth= new JPanel();
		panelSouth.setLayout(new BoxLayout(panelSouth, BoxLayout.Y_AXIS));
		panelSouth.add(message);
		panelSouth.add(envoyer);
		envoyer.setAlignmentX(panelSouth.CENTER_ALIGNMENT);
		panel.setLayout(borderLayout);
		panel.add(messages,BorderLayout.CENTER);
		panel.add(panelSouth,BorderLayout.SOUTH);
		
		fenetre.add(panel);
		fenetre.setVisible(true);
	}
	
	public void affiche(String msg) {
		messages.setText(messages.getText() + "\n" + msg);
	}

}
