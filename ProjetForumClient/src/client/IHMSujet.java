package client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class IHMSujet extends JFrame {
	public IHMSujet(String nom)
	  {
		    this.setTitle(nom); //On donne un titre à l'application
			this.setSize(320,320); //On donne une taille à notre fenêtre
			this.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
			this.setResizable(false) ; //On interdit la redimensionnement de la fenêtre
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //On dit à l'application de se fermer
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
			
			this.add(panel);
			this.setVisible(true);
			
	  }
	public static void main(String[] args) {
		new IHMSujet("Sport");
	}
}
