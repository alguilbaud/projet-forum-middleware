package client;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IHMSujets {
	private JFrame fenetre;

	private void creationFenetre()
	{
		fenetre = new JFrame("Liste des sujets");
		
		fenetre.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		fenetre.setResizable(true); 
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		fenetre.getContentPane().add(panel,"North");

		
		JPanel buttonPane = new JPanel();
		creationBoutons(buttonPane);
		
		
		JPanel globalPane = new JPanel();
		globalPane.setLayout(new BorderLayout());
		globalPane.add(buttonPane, BorderLayout.NORTH);
		
		fenetre.getContentPane().add(globalPane);
		fenetre.pack();
		
		fenetre.setVisible(true);
	}
	
	private void creationBoutons(JPanel panel){
		ArrayList<String> mot = new ArrayList<String>();
		mot.add("B");
		mot.add("O");
		mot.add("N");
		mot.add("J");
		mot.add("O");
		mot.add("U");
		mot.add("R");
		Collections.shuffle(mot);
		
		//ArrayList<JButton> taboutons = new ArrayList<JButton>();
		JButton bouton;
		for(int i=0;i<7;i++){
			bouton = new JButton(mot.get(i));
			ActionBoutonSujet listener = new ActionBoutonSujet(bouton);
			listener.start();
			bouton.addActionListener(listener);
			//taboutons.add(bouton);
			panel.add(bouton);
		}
	}
}
