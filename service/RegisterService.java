package service;

import pojo.ATMUser;

public interface RegisterService {
	public void checkEmail(ATMUser ref);
	public void checkPassword(ATMUser ref);
	public void checkSecurity(ATMUser ref);
}
