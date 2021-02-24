package org.sample;

public class FullCompany implements FullEmployee,FullClient{

	@Override
	public void clientName() {
		System.out.println("Amazon");
		
	}
	@Override
	public void empId() {
		System.out.println("1234");
		
	}
	@Override
	public void empName() {
		System.out.println("Priya");
		
	}
	public static void main(String[] args) {
		FullCompany c = new FullCompany();
		c.clientName();
		c.empId();
		c.empName();
	}



	}
