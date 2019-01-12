package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.services.IServicesRemote;

public class AffecterArtCmd {

	public static void main(String[] args) throws NamingException{
		
		// TODO Auto-generated method stub
		String jindi2e ="exam-ear/exam-ejb/ServicesRemote!tn.esprit.services.IServicesRemote";
		Context context = new InitialContext();
		IServicesRemote proxy =  (IServicesRemote) context.lookup(jindi2e); 
		
		proxy.affecerArtCmd(1, 1);
		 
	}

}
