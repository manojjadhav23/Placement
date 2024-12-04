package days;

import java.time.LocalDate;

public class Vendor extends Employee {
      private int noofemp;
      private int amt;
	public Vendor() {
		super();
	}
	public Vendor(int id,String name,String mobile,String email,String dep,String deg,LocalDate dt,int noofemp, int amt) {
		super(id,name,mobile,email,dep,deg,dt);
		this.noofemp = noofemp;
		this.amt = amt;
	}
	public int getNoofemp() {
		return noofemp;
	}
	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return super.toString()+"Vendor [noofemp=" + noofemp + ", amt=" + amt + "]";
	}
      
      
      
}
