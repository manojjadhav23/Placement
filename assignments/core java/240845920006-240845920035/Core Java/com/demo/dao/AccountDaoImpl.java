package com.demo.dao;

import com.demo.beans.Account;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import com.demo.beans.Account;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;

public class AccountDaoImpl implements AccountDao{
	static Set<Account> accset;
	static {
		accset=new HashSet<>();
		accset.add(new SavingAccount("Akanksha",1212,"City?","Pune",5555,676767));
		accset.add(new SavingAccount("Aishwarya",8888,"City?","Nagpur",34343,2211));
		accset.add(new CurrentAccount("Aishwarya",3333,"favorite color?","pink",454545,20));
		
		Account.setCnt(3);
	}
	@Override
	public boolean saveaccount(Account ac) {
		
		accset.add(ac);
		return true;

}
	@Override
	public Set<Account> findAll() {
		
		return accset;
	}
	@Override
	public Account findbyid(String acid, int pin) {
		for(Account ac:accset)
		{
			if(ac.getAcid().equals(acid) && ac.getPin()==pin);
			{
				return ac;
			}
		}
		return null;
	}
	@Override
	public Account seaechbyid(String acid, int pin) {
		for(Account ac:accset)
		{
			if(ac.getAcid().equals(acid) && ac.getPin()==pin);
			{
				return ac;
			}
		}
		return null;
	}
	
	}
