package service;

import pojo.ATMUser;

public interface ResetService {

	public void checkStatusReset(ATMUser refATMUser); //method to check user email and security key
	public void checkPassword(ATMUser refATMUser); //method to check password and retype password
	
}
