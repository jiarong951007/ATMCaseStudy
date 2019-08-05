package dao;

import pojo.ATMUser;

public interface ResetDAO {

	boolean resetValidate(ATMUser ref); //verify email and security question for reset password method
	boolean verifyPassword(ATMUser ref); //check if password and retype password is the same 

}
