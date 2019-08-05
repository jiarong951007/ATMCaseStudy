package dao;

import pojo.ATMUser;

public interface LogonDAO {

	boolean logonValidate(ATMUser ref);
}
