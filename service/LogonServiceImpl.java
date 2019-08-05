package service;

import java.util.Scanner;

import dao.LogonDAO;
import dao.LogonDAOImpl;
import pojo.ATMUser;

public class LogonServiceImpl implements LogonService{
	
	LogonDAO refLogonDAO; 
	
	@Override
	public void checkStatus(ATMUser ref) {
		
		refLogonDAO = new LogonDAOImpl(); //create object to call method in LogonDAO
			if(refLogonDAO.logonValidate(ref)==true) {
				System.out.println("Login successful!!!"); 
				transaction();
			} else {
				System.out.println("Login unsuccessful!!!\n");
				}
			}
			
				
	//creating methods for deposit and withdrawal
				
				int balance = 0; //initializing the balance
				int depositamt = 0; 
				int withdrawamt =0;
				String yesno;
				int transaction;
				
	public void transaction()  { //transferred to transaction page if login is successful
		Scanner transact = new Scanner(System.in);
		
		{
		System.out.println(); 
		System.out.println("Type1: Check Available Bank Balance");
		System.out.println("Type2: Deposit Amount");
		System.out.println("Type3: Withdraw Amount");
		
		
		//enter the transaction option: Type 1, 2 or 3 
		int transaction = transact.nextInt();
	
		switch(transaction) 
		{
		case 1:
			System.out.println("Available Balance: "+balance);	
			proceed(); //calls proceed method
		
		case 2:
			deposit(); //calls deposit method
			proceed(); //calls proceed method
			
		case 3:
			withdraw(); //calls withdraw method
			proceed(); // calls proceed method
			
		}
		}
	}
	
	public void deposit() { //deposit method, invalid if deposit amount <= 0
		Scanner deposit = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		depositamt = deposit.nextInt();
		if (depositamt <=0){
            System.out.println("Amount can't be negative!!"); 
            deposit();
            
		 } else{
	            balance += depositamt; //deposit amount added to balance
	            System.out.println(depositamt+" dollar deposited successfully!!");
	        }
	}
	
	public void withdraw() { //withdraw method, withdrawal amount cannot > balance
		Scanner withdraw = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		withdrawamt = withdraw.nextInt();
		if (withdrawamt > balance){
            System.out.println("Sorry!! Insufficient balance.");
            proceed();
          
        } else{
            balance -= withdrawamt; //withdraw amount deducted from balance
            System.out.println("Transaction successfully!!");
        }
	}

	public void proceed() { //method when prompt to continue, yes or no
		Scanner proceed = new Scanner(System.in);
		System.out.println("Wish to continue?(y/n)\n");
		yesno = proceed.next(); 
		if (yesno.equals("y")) {
			transaction(); //calls transaction method if user wish to continue
		} else if (yesno.equals("n")) {
			System.out.println("Thanks for Banking with Us!");
			System.exit(0);
		} else {
			System.out.println("Invalid choice!"); //cannot select anything other than y/n
			proceed();
		}
							
			
	}

	
}
	



