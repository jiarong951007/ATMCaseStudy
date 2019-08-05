package application;

import java.util.Scanner;

import controller.RegisterController;
import controller.ResetController;
import controller.LogonController;

public class Homepage {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("User Home Page:");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Forget Password");
			System.out.println("4.Logout (exit)");
			
			System.out.println("\nEnter Your Choice:");

			int n = sc.nextInt(); //to enter the options 1,2,3 or 4. 
			
			switch(n)
			{
			case 1: //if option 1 is selected, the userRegisterController method under RegisterController() class is called. 
				RegisterController refRegisterController = new RegisterController();
				refRegisterController.userRegisterController(); 
				break;
			
			case 2: //if option 2 is selected, the userLogonController method under LogonController() class is called. 
				LogonController refLogonController = new LogonController();
				refLogonController.userLogonController();
				break;
				
			case 3: //if option 2 is selected, the userLogonController method under LogonController() class is called. 
				ResetController refResetController = new ResetController();
				refResetController.userResetController();
				break;
			
			case 4:
				System.out.println("Logout Successfully!");
				System.exit(0);
				break;
				
		}
		}
	}
}
	

