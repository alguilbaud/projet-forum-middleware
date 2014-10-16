package client;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IHMSujets extends JFrame{
	
  public IHMSujets()
  {
	    this.setTitle("Liste des sujets"); //On donne un titre à l'application
		this.setSize(320,80); //On donne une taille à notre fenêtre
		this.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		this.setResizable(false) ; //On interdit la redimensionnement de la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer
		
		JButton button= new JButton("Sport");
		JButton button1= new JButton("Cinéma");
		JButton button2= new JButton("Musqiue");
		FlowLayout flowLayout=new FlowLayout();
		JPanel panel= new JPanel();
		panel.setLayout(flowLayout);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		this.add(panel);
		button.addActionListener(new OuvrirFenetreSujet());
		button1.addActionListener(new OuvrirFenetreSujet());
		button2.addActionListener(new OuvrirFenetreSujet());
		this.setVisible(true);
		
  }
  public static void main(String[] args) {
	  new IHMSujets();
}
	
}
