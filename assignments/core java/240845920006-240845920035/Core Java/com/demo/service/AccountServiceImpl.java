package com.demo.service;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;
import com.demo.dao.*;

public class AccountServiceImpl implements AccountService {

	private AccountDao adao;
	
	public AccountServiceImpl()
	{
		adao = new  AccountDaoImpl();
	}
	
	@Override
	public boolean addNewAcnt(int ch) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String nm=sc.next();
		System.out.println("Enter 4 digit pin");
		int pin=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter secrete question");
		String question=sc.nextLine();
		System.out.println("Enter answer");
		String ans=sc.next();
		System.out.println("Enter amount to be deposited");
		double amt=sc.nextDouble();
		if(ch==1) {
			System.out.println("Enter chequebook number");
			int cnum=sc.nextInt();
			Account ac=new SavingAccount(nm,pin,question,ans,amt,cnum);
			return adao.saveaccount(ac);
		}
		else if(ch==2) {
			System.out.println("Enter number of transaction");
			int tnum=sc.nextInt();
			Account ac=new CurrentAccount(nm,pin,question,ans,amt,tnum);
			return adao.saveaccount(ac);
		}
		return false;
	}

	@Override
	public Set<Account> findAll() {
	
		return adao.findAll();
	}

	@Override
	public boolean depositeamt(String acid, int pin, double amt) {
	
		Account ac=adao.findbyid(acid,pin);
		if(ac!=null)
		{
			ac.deposite(amt);
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public int withdrawamt(String acid, int pin, double amt) {
		Account ac=adao.seaechbyid(acid,pin);
		
		if(ac!=null)
		{
			return ac.withdraw(amt);
			
		}
		
		else 
		{
			return 3;
		}
		
	}
}


