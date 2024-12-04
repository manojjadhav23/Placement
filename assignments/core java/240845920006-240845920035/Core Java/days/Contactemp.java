package days;

import java.time.LocalDate;

public class Contactemp extends Employee{

	private int hr;
	private int rate;
	public Contactemp() {
		super();
	}
	public Contactemp(int id, String name, String mobile, String email, String dep, String deg, LocalDate dt,int hr, int rate) {
		super(id,name,mobile,email,dep,deg,dt);
		this.hr = hr;
		this.rate = rate;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return super.toString()+ "Contactemp [hr=" + hr + ", rate=" + rate + "]";
	}
	
	
	
}
