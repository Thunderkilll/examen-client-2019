package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.entite.Categorie;
import tn.esprit.services.IServicesRemote;

 

public class AjoutCategorie {

	public static void main(String[] args)   throws NamingException{
		// TODO Auto-generated method stub
		String jindi2a ="exam-ear/exam-ejb/ServicesRemote!tn.esprit.services.IServicesRemote";
		Context context = new InitialContext();
		IServicesRemote proxy =  (IServicesRemote) context.lookup(jindi2a); 
		
		
		//c1
		Categorie c1 = new Categorie();
		c1.setNomcat("Alimentaire");
		//c2
		Categorie c2 = new Categorie();
		c2.setNomcat("Maison");
		
		proxy.ajouterCategories(c1);
		proxy.ajouterCategories(c2);
		
		context.close();
		
	}

}
