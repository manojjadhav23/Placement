package CLasses;

public class Student {
	private int s_id;
	private String s_name;
	private float m1,m2,m3;
	
	public Student() {
		this(0,null,0,0,0);
	}
	
	public Student(int id,String name,float m1,float m2,float m3) {
		this.s_id=id;
		this.s_name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	//setter Method
	public void setid(int id) {this.s_id=id;}
	public void setname(String name) {this.s_name=name;}
	public void setm1(float m1) {this.m1=m1;}
	public void setm2(float m2) {this.m2=m2;}
	public void setm3(float m3) {this.m3=m3;}
	
	//getter Method
	
	public int getid() {return s_id;}
	public String getname() {return s_name;}
	public float getm1() {return m1;}
	public float getm2() {return m2;}
	public float getm3() {return m3;}
	
	public String toString() {
		return "Id:"+s_id+"\n Name:"+s_name+"\n Marks1:"+m1+"\n Marks2:"+m2+"\n Marks3:"+m3;
	}
}
