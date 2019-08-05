package controller;

import java.util.Scanner;

import pojo.ATMUser;
import service.LogonService;
import service.LogonServiceImpl;

public class LogonController {
	
	LogonService refLogonService;
	ATMUser refATMUser;
	public void userLogonController() {
		logonInput();
	}
	
	void logonInput() {
		Scanner sc = new Scanner(System.in);
		//step 1 : ask user email and Password
		System.out.println("Enter your email address : ");
		String userEmail = sc.next();
		
		System.out.println("Enter your password : ");
		String userPassword = sc.next();
	
	//step 2 : create object of ATMUser class
			refATMUser = new ATMUser();
			
			//step 3 : set value to setter method of User Class
			refATMUser.setUserEmail(userEmail);
			refATMUser.setUserPassword(userPassword);
			
			//step 4 : create object of LoginServiceImpl class and refer to it interface
			refLogonService = new LogonServiceImpl();//we have to create object
			refLogonService.checkStatus(refATMUser);
		}
}
