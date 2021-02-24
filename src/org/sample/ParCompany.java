package org.sample;

public class ParCompany extends ParEmployee{

	@Override
	public void empId() {
		System.out.println("Employee ID is 1234");
		
	}

	@Override
	public void empName() {
		System.out.println("Employee Name is Priya");
		
	}
	public static void main(String[] args) {
		ParCompany c = new ParCompany();
		c.empId();
		c.empName();
		c.empLocation("USA");
	}
	
	

}
