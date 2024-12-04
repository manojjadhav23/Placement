package com.demo.test;
import java.util.Scanner;
import java.util.List;
import java.util.Set;
import com.demo.beans.Account;
import com.demo.service.*;

public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountService aservice=new AccountServiceImpl();
		LoginService lservice=new LoginServiceImpl();
		System.out.println("Enter User Id");
		String uname=sc.next();
		
		System.out.println("Enter User password");
		String pass=sc.next();
		String check=lservice.authenticate(uname,pass);
		
		int choice=0;
		if(check.equals("user")) {
		do {
			System.out.println("1.Open new account\n2.Display All\n3.withdraw amount\n4.deposite amount\n 5.Exit");
			choice=sc.nextInt();
			switch(choice) {
			
			
			
			
			case 1->{
				System.out.println("1.Saving Acount \t 2.Current Account");
				int ch=sc.nextInt();
				boolean status=aservice.addNewAcnt(ch);
				if(status) {
					System.out.println("User Account created");
				}else
				{
					System.out.println("Credential Error");
				}
			
			}
			
			case 2->{
				Set<Account> sset=aservice.findAll();
				sset.stream().forEach(System.out::println);
			
			}
			
			case 3->
			{
				System.out.println("enter the acc id ");
				String acid=sc.next();
				System.out.println("enter acc pin");
				int pin=sc.nextInt();
				System.out.println("enter amount to withdraw");
				double amt=sc.nextDouble();
				int ans=aservice.withdrawamt(acid,pin,amt);
				
				if(ans==1)
				{
					 String boldGrayLine = "\033[1m  withdraw done  \033[0m";
					 System.out.println(boldGrayLine);
					
					
					
				}
				else if(ans==2)
				{
					String boldGrayLine =  "\033[1m     insufficent balance     \033[0m";
					 System.out.println(boldGrayLine);
;
				}
				else
				{
					String boldGrayLine = "\033[1m wromg crendiential \033[0m";
					 System.out.println(boldGrayLine);

				}
				
				 
				
			}
			
			case 4->
			{
				System.out.println("enter the acc id ");
				String acid=sc.next();
				System.out.println("enter acc pin");
				int pin=sc.nextInt();
				System.out.println("enter amount to deposited");
				double amt=sc.nextDouble();
				boolean ans=aservice.depositeamt(acid,pin,amt);
				
				if(ans) {
					System.out.println("money deposited");
				}
				else
				{
					System.out.println("not deposited");
				}
				
				
				   
			}
			case 5->{
				System.out.println("Thank You for visiting!!!!!!!");
				sc.close();
			}
			 default->System.out.println("wrong choice");
			}
			
		}while(choice!=10);
		}
		
	}

}
