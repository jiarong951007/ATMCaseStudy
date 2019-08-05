package dao;

import pojo.ATMUser;

public interface LogonDAO {

	boolean logonValidate(ATMUser ref); //method to validate user email and password
}
