package service;

import pojo.ATMUser;

public interface ResetService {

	public void checkStatusReset(ATMUser refATMUser);
	public void checkPassword(ATMUser refATMUser);
	
}
