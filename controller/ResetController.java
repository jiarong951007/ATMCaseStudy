package controller;

import java.util.Scanner;

import pojo.ATMUser;
import service.RegisterServiceImpl;
import service.ResetService;
import service.ResetServiceImpl;

public class ResetController {


	ResetService refResetService = new ResetServiceImpl(); 
	ATMUser refATMUser = new ATMUser();
	
	public void userResetController() {
		InputEmail(); }
	
	public void InputEmail() { //method to enter email address
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email address : ");
		String userEmail = sc.next();
		
		refATMUser.setUserEmail(userEmail);  
		InputSecurity();}
	
	
	public void InputSecurity() { //method to enter security key
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your favourite color? ");
		String userSecurity = sc.next();
		
		
		refATMUser.setSecurity(userSecurity);  
		refResetService.checkStatusReset(refATMUser);	
		InputPassword(); }
	
	
	public void InputPassword() { //method to enter and set new password
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new password: ");
		String userPassword = sc.next();
		

		refATMUser.setUserPassword(userPassword);
		RetypePassword();} 
	
 public	void RetypePassword() { //method to match retype password and password
		Scanner sc = new Scanner(System.in);
		System.out.println("Retype your password: ");
		String rePassword = sc.next();
		
		refATMUser.setRePassword(rePassword);
		refResetService.checkPassword(refATMUser); }
		
		public void NewSecurity() {
			Scanner sc = new Scanner(System.in);
			System.out.println("What is your favourite color?");
			String userSecurity = sc.next();
			
			refATMUser.setSecurity(userSecurity);
			System.out.println(userSecurity+" is your security. if your forget your password");
			System.out.println("Your password has been reset successfully");
			
			System.exit(0);
			
			
		
}
 }
