package service;

import controller.ResetController;
import dao.ResetDAO;
import dao.ResetDAOImpl;
import pojo.ATMUser;

public class ResetServiceImpl implements ResetService {

	
	
	public void checkStatusReset(ATMUser refATMUser) {
		

		 ResetDAO refResetDAO = new ResetDAOImpl(); //create object to call method in ResetDAO
		 ResetController refResetController = new ResetController(); //create object to call method in ResetController
	
			if(refResetDAO.resetValidate(refATMUser)==true) { 
				refResetController.InputPassword();
			} else {
				System.out.println("Wrong email or security code!!!");
				refResetController.InputEmail();
				refResetController.InputSecurity();
				}
			}
	
	public void checkPassword(ATMUser refATMUser) {
		

		 ResetDAO refResetDAO = new ResetDAOImpl(); //create object to call method in ResetDAO
		 ResetController refResetController = new ResetController(); //create object to call method in ResetController
		
		 
		if (refResetDAO.verifyPassword(refATMUser)==true) {
			refResetController.NewSecurity();
			
			
		} else {
			System.out.println("Password doesn't match!!");
			refResetController.InputPassword();
			refResetController.RetypePassword();
		}
	
		
			}
					}

	
