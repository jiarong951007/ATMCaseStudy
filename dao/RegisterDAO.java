package dao;

import pojo.ATMUser;

public interface RegisterDAO {
	boolean verifyEmail(ATMUser ref); //verify email method
	boolean verifyPassword(ATMUser ref); //verify password method


}
