package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.entite.Article;
import tn.esprit.services.IServicesRemote;

public class AjoutArticle {

	public static void main(String[] args)  throws NamingException{
		
					// TODO Auto-generated method stub
					String jindi2b ="exam-ear/exam-ejb/ServicesRemote!tn.esprit.services.IServicesRemote";
					Context context = new InitialContext();
					IServicesRemote proxy =  (IServicesRemote) context.lookup(jindi2b); 
					
					//article 1 
					Article a1 = new Article();
					a1.setImage("img1.png");
					a1.setNom("Pain");
					a1.setPrix(300);
			 proxy.ajouterArticle(a1);
			 
			 
				context.close();
				
	}

}
