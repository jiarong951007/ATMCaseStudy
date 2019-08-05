package dao;
import pojo.ATMUser;

public class LogonDAOImpl implements LogonDAO {
	
	public boolean status;
	//connect with DB
	
	@Override
	public boolean logonValidate(ATMUser ref) {
		
		if(ref.getUserEmail().equals("opt@gmail.com") && ref.getUserPassword().equals("xyz123")) {
			status = true;
		} else {
			status = false;
		}
		
	return status;

}

}