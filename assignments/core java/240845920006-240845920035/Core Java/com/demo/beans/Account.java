package com.demo.beans;

public abstract class Account {

	static int cnt;
	static {
		cnt=0;
	}
	private String acid;
	private String aname;
	private int pin;
	private String question;
	private String ans;
	protected double balance;
	
	public int hashCode() {
		return aname.hashCode()+pin;
	}
	//public boolean equals(Object o) {
	
		//}
	public Account(String type) {
		
		super();
		this.acid=generateId(type,null);
	}
	private String generateId(String type,String aname) {
		String id=null;
		if(aname!=null) {
			id=type+aname.substring(0,2)+cnt;
		}else {
			id=type+"xx"+cnt;
		}
		cnt++;
		return id;
	}
	public Account(String acid, String aname, int pin, String question, String ans, double balance) {
		super();
		this.acid = acid;
		this.aname = aname;
		this.pin = pin;
		this.question = question;
		this.ans = ans;
		this.balance = balance;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Account.cnt = cnt;
	}

	public String getAcid() {
		return acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acid=" + acid + ", aname=" + aname + ", pin=" + pin + ", question=" + question + ", ans=" + ans
				+ ", balance=" + balance + "]";
	}

	public void deposite(double amt) {
	balance=balance+amt;
		
	}

	abstract public int withdraw(double amt);
	
}
