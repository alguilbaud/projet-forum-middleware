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
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IHMChoix{
	
	public IHMChoix(IServeurC serveur)
	{
		JFrame fenetre = new JFrame();
	    fenetre.setTitle("Choisir un sujet"); //On donne un titre à l'application
		fenetre.setSize(320,80); //On donne une taille à notre fenêtre
		fenetre.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		fenetre.setResizable(false) ; //On interdit la redimensionnement de la fenêtre
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer
		
		FlowLayout flowLayout=new FlowLayout();
		JPanel panel= new JPanel();
		panel.setLayout(flowLayout);
		fenetre.add(panel);
		
		Set<String> sujets = null;
		try {
			sujets = serveur.ensembleSujets();
			for(String s : sujets){
				JButton button = new JButton(s);
				button.addActionListener(new ActionBoutonSujet(serveur.obtientSujet(s)));
				panel.add(button);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		fenetre.setVisible(true);	
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
