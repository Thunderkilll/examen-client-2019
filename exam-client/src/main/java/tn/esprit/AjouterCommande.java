package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.entite.Commande;
import tn.esprit.entite.Status;
import tn.esprit.services.IServicesRemote;

public class AjouterCommande {

	public static void main(String[] args) throws NamingException{
		
		// TODO Auto-generated method stub
		String jindi2c ="exam-ear/exam-ejb/ServicesRemote!tn.esprit.services.IServicesRemote";
		Context context = new InitialContext();
		IServicesRemote proxy =  (IServicesRemote) context.lookup(jindi2c); 
		
	 
		//commande
		Commande c = new Commande();
	    c.setDateLivraison("2018-11-28");
		c.setStatus(Status.pretpourlivraison);
		//proxy.ajouterCommande(c);
		proxy.getAllArticleNamesByCategorie(1);
		
		
		

	}

}
