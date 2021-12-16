package a;

import java.util.Date;

public class Employee {
	
	public String name;
	public double salary;
	public Date birthDate;
	
	
	public String getDetails() {
		return "Person[name=" + name + ", salary=" + salary + ", birthdate=" + birthDate + "]";
//		return "" + salary;
	}
	


}
