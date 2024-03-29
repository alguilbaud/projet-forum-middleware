package service;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Afficheur extends UnicastRemoteObject implements IAfficheur {
	
	private JFrame fenetre;
	private JTextArea messages;
	private ISujet sujet;
	private JScrollPane scrollPane;
	
	public boolean ouvert;
	
	public Afficheur(ISujet suj) throws RemoteException {
		super();
		sujet = suj;
		fenetre = new JFrame();
		fenetre.setTitle(sujet.getNom()); //On donne un titre à l'application
		fenetre.setSize(320,320); //On donne une taille à notre fenêtre
		fenetre.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		fenetre.setResizable(false); //On interdit la redimensionnement de la fenêtre
		fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //On dit à l'application de se fermer
		BorderLayout borderLayout = new BorderLayout();
		
		messages = new JTextArea();
		messages.setEditable(false);
		
		scrollPane = new JScrollPane(messages); //ascenceur pour les messages quand il y en a de trop
		
		JTextField pseudo = new JTextField("Anonyme");
		
		JTextField msg = new JTextField();
		JButton envoyer = new JButton("envoyer");
		
		//creation d'une classe implémentant ActionListener() pour la lier au bouton envoyer
		envoyer.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				try {
					pseudo.setEditable(false);
					sujet.diffuser(pseudo.getText() + " : " + msg.getText());
					msg.setText("");
					
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JPanel panel = new JPanel();
		JPanel panelSouth = new JPanel();
		JPanel panelNorth = new JPanel();
		
		panelSouth.setLayout(new BoxLayout(panelSouth, BoxLayout.Y_AXIS));
		panelSouth.add(msg);
		panelSouth.add(envoyer);
		
		panelNorth.add(pseudo);
		
		envoyer.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.setLayout(borderLayout);
		panel.add(scrollPane,BorderLayout.CENTER);
		panel.add(panelSouth,BorderLayout.SOUTH);
		panel.add(panelNorth,BorderLayout.NORTH);
		
		fenetre.add(panel);
		
		fenetre.addWindowListener(new WindowListener(){
			public void windowOpened(WindowEvent e) {}

			public void windowClosing(WindowEvent e) {}

			public void windowClosed(WindowEvent e) {
				try {
					sujet.desinscription(Afficheur.this);
					ouvert = false;
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
			}

			public void windowIconified(WindowEvent e) {}

			public void windowDeiconified(WindowEvent e) {}

			public void windowActivated(WindowEvent e) {}

			public void windowDeactivated(WindowEvent e) {}
			
		});
		
		ouvert = true;
		
		fenetre.setVisible(true);
	}
	
	public void affiche(String msg) throws RemoteException{
		messages.setText(msg + "\n" + messages.getText());
	}

	public void fermer(){
		fenetre.dispose();
	}
}
