package controller;

import java.util.Scanner;

import pojo.ATMUser;
import service.RegisterService;
import service.RegisterServiceImpl;

public class RegisterController {
	
	ATMUser refATMUser = new ATMUser();
	RegisterService refRegisterService = new RegisterServiceImpl();
	
	
	public void userRegisterController() {
		InputEmail();		
	}
	
	public void InputEmail() { //method to enter and set email address
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email address : ");
		String userEmail = sc.next();
	
		refATMUser.setUserEmail(userEmail);  
		refRegisterService.checkEmail(refATMUser);}		
	
		public void InputPassword() { //method to enter and set password
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your password: ");
			String userPassword = sc.next();
	
	
			refATMUser.setUserPassword(userPassword);
			RetypePassword();} 
		
	 public	void RetypePassword() { //method to match retype password and password
			Scanner sc = new Scanner(System.in);
			System.out.println("Retype your password: ");
			String rePassword = sc.next();
		
		
			refATMUser.setRePassword(rePassword); 
	 		refRegisterService.checkPassword(refATMUser);}
		
		public void InputSecurity() { //method to enter and set security question 
			Scanner sc = new Scanner(System.in);
			System.out.println("Your favourite color is? ");
			String userSecurity = sc.next();
		
			
			refATMUser.setSecurity(userSecurity); 
			refRegisterService.checkSecurity(refATMUser);
			
		
		}
	
}