package service;

import java.rmi.Naming;

public class LancementClient {

	public static void main(String[] args) {
		 try {
			 IServeur serveur = (IServeur) Naming.lookup("rmi://localhost:8099/serveur");
			 System.out.println(serveur);
			 IHMChoix ihm = new IHMChoix(serveur);
		 } catch(Exception e){
			 e.printStackTrace();
		 }
	}

}
