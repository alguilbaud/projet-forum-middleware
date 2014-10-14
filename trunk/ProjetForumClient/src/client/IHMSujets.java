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
		this.setSize(320,240); //On donne une taille à notre fenêtre
		this.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		this.setResizable(false) ; //On interdit la redimensionnement de la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer
		this.setVisible(true);
		JButton button= new JButton("Sport");
		JButton button1= new JButton("Cinéma");
		JButton button2= new JButton("Musqiue");
		FlowLayout flowLayout=new FlowLayout();
		
		
		
  }
  public static void main(String[] args) {
	  new IHMSujets();
}
	
}
