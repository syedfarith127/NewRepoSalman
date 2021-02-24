package org.sample;

public class AbCompany implements AbEmployee,AbClient{

	@Override
	public void clientLocation(String f) {
		System.out.println(f);
		
	}

	@Override
	public void clientName(String r) {
		System.out.println(r);
		
	}

	@Override
	public void empId(int a) {
		System.out.println(a);
		
	}

	@Override
	public void empName(String s) {
		System.out.println(s);
		
	}

	@Override
	public void empLocation(String d) {
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		AbCompany c = new AbCompany();
		
		c.empLocation("Mexico");
		c.empName("Rajesh");
		c.clientLocation("USA");
		c.clientName("Amazon");
	}

	
}
