package org.employee;

public class EmployeeDetails {
	
	//           method 1
	private void empName() {
		
		System.out.println("Employee name is : Anand");
		
	}
	//           method 2
	private void empMobNo() {
		
		System.out.println("Employee mobile number is : 8667070832");
		
	}
	   //      method 3
	private void empId() {
		System.out.println("Employee id is : 6546");
	}
	
	//          main method
	public static void main(String[] args) {
		
		// object
		EmployeeDetails ed = new EmployeeDetails();
		
		// method call
		ed.empId();
		ed.empMobNo();
		ed.empName();
		
	}

}
