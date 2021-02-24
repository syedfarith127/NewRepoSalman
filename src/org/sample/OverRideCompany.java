package org.sample;

public class OverRideCompany extends OverRideEmployee {
	
	@Override
	public void empId(int a) {
		System.out.println("Child Class Method"+a);
	}
	@Override
	public void empName(String b) {
		
		super.empName(b);
	}
	public static void main(String[] args) {
		OverRideCompany c = new OverRideCompany();
		c.empId(1234);
		c.empName("Priya");
	}

}
