package client;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IHMChoix extends JFrame{
	
	//TODO A MODIF !!
	
	public IHMChoix()
	{
		//virer les this et virer extends JFrame
		
	    this.setTitle("Liste des sujets"); //On donne un titre à l'application
		this.setSize(320,80); //On donne une taille à notre fenêtre
		this.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		this.setResizable(false) ; //On interdit la redimensionnement de la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer
		
		FlowLayout flowLayout=new FlowLayout();
		JPanel panel= new JPanel();
		panel.setLayout(flowLayout);
		this.add(panel);
		
		//boucle
		JButton button= new JButton("Sport");
		JButton button1= new JButton("Cinéma");
		JButton button2= new JButton("Musqiue");
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		button.addActionListener(new ActionBoutonSujet());
		button1.addActionListener(new ActionBoutonSujet());
		button2.addActionListener(new ActionBoutonSujet());
		
		this.setVisible(true);
		
	}
  /*public static void main(String[] args) {
	  new IHMSujets();
	  try {
		    ISujet sujet=(ISujet)Naming.lookup("rmi://localhost:8099/sujet");
		    sujet.diffuser("aaa");
	      } catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
	     }
	}*/
	
}