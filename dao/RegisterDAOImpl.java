package dao;

import pojo.ATMUser;

public class RegisterDAOImpl implements RegisterDAO {


	boolean status;

	
	// get userEmail
	public boolean verifyEmail(ATMUser ref) {
		if(ref.getUserEmail().equals("opt@gmail.com")) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
		
	
	// get password and retype password from getter method for verification
	public boolean verifyPassword(ATMUser ref) {
		if(ref.getUserPassword().equals(ref.getRePassword())) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
	

}
	
		
		
	

