package dao;
import pojo.ATMUser;

public class ResetDAOImpl implements ResetDAO {
	
	public boolean status;
	//connect with DB

	

	public boolean resetValidate(ATMUser ref) {
		

		if(ref.getUserEmail().equals("opt@gmail.com") && ref.getSecurity().equals("black")) {
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

