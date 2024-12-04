package com.demo.beans;

public class CurrentAccount extends Account {
	private int min_transaction;
	private  float int_rate;
	private float min_balance;
	public CurrentAccount() {
		super("");
	}
	public CurrentAccount( String aname,int pin,String question,String ans,double balance,int min_transaction, float int_rate, float min_balance) {
		super(aname,pin,question,ans,balance);
		this.min_transaction = min_transaction;
		this.int_rate = int_rate;
		this.min_balance = min_balance;
	}
	
	
	

}
