package tn.esprit;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.entite.Role;
import tn.esprit.entite.User;
import tn.esprit.services.IUserServiceRemote;

public class Main {

	public static void main(String[] args) throws NamingException {
		 
		String jindiUser = "exam-ear/exam-ejb/UserService!tn.esprit.services.IUserServiceRemote";
		Context context = new InitialContext();
		IUserServiceRemote proxy =  (IUserServiceRemote) context.lookup(jindiUser); 
		System.out.println("I'm in main of client class ");
		//adding users
//		User user1 = new User();
//		user1.setEmail("elyes1@gmail.com");
//		user1.setPassword("elyes1");
//		user1.setRole(Role.admin);
//		user1.setId(proxy.addUser(user1));
		
		List<User> users = proxy.getAllUsers();
		for(User u : users){
			System.out.println(u.toString());
		}
		
		
		context.close();
	}

}
