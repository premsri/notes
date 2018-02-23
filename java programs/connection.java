package in.oops;

import java.util.ArrayList;
import java.util.List;

public class connection extends Employee {
	
	
	public static void main(String[] args) {
		

	List<Employee> ex = new ArrayList<Employee>();
	Employee E1 =new Employee();
	E1.setId(1);
	E1.setName("prem");
	ex.add(E1);
	Employee E2 =new Employee();
	E2.setId(2);
	E2.setName("Kumar");
	ex.add(E2);
	
	for (Employee emp : ex) {
		
		System.out.println(emp.getId());
		
		System.out.println(emp.getName());
	}
	
	
	
	
	}
}

