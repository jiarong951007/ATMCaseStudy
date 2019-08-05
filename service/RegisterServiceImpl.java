package service;

import controller.RegisterController;
import controller.ResetController;
import dao.RegisterDAO;
import dao.RegisterDAOImpl;
import dao.ResetDAO;
import dao.ResetDAOImpl;
import pojo.ATMUser;

public class RegisterServiceImpl implements RegisterService { 

		
		//method to check if email is valid
		public void checkEmail(ATMUser ref) {
			
			
			RegisterDAO refRegisterDAO = new RegisterDAOImpl(); //create object to call method in RegisterDAO
			RegisterController refRegisterController = new RegisterController(); //create object to call method in RegisterController
			
			if (refRegisterDAO.verifyEmail(ref)==true) {
			refRegisterController.InputPassword();
			} else {
				System.out.println("Email already exists!!!"); 
				refRegisterController.InputEmail();
			}
			}
		//method to check if password and retype password matches
		public void checkPassword(ATMUser ref) {
			

			RegisterDAO refRegisterDAO = new RegisterDAOImpl(); //create object to call method in RegisterDAO
			RegisterController refRegisterController = new RegisterController(); //create object to call method in RegisterController
			
			
			if (refRegisterDAO.verifyPassword(ref)==true) {
				refRegisterController.InputSecurity();
			} else {
				System.out.println("Password doesn't match!!");
				refRegisterController.InputPassword();
			
			}
		}
			//method to check if security key is valid
			public void checkSecurity(ATMUser ref) {
			
				RegisterDAO refRegisterDAO = new RegisterDAOImpl(); //create object to call method in RegisterDAO
				RegisterController refRegisterController = new RegisterController(); //create object to call method in RegisterController
				ATMUser refATMUser = new ATMUser();
	
					
					
					System.out.println(ref.getSecurity()+" is your security key, incase if you forget your password");
					System.out.println("\nRegistration successful!!!");

			}
			
						
			
		}
	

