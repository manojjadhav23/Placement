package days;

import java.time.LocalDate;

public class Employee extends Person {
          private String dep;
          private String deg;
          private LocalDate dt;
          
          
		public Employee() {
			super();
		}


		public Employee(int id, String name, String mobile, String email, String dep, String deg, LocalDate dt) {
			super(id, name, mobile, email);
			this.dep = dep;
			this.deg = deg;
			this.dt = dt;
		}


		public String getDep() {
			return dep;
		}


		public void setDep(String dep) {
			this.dep = dep;
		}


		public String getDeg() {
			return deg;
		}


		public void setDeg(String deg) {
			this.deg = deg;
		}


		public LocalDate getDt() {
			return dt;
		}


		public void setDt(LocalDate dt) {
			this.dt = dt;
		}


		@Override
		public String toString() {
			return super.toString()+"Employee [dep=" + dep + ", deg=" + deg + ", dt=" + dt + "]";
		}
		
		
          
          
}



