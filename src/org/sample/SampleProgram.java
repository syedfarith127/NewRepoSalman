//package 
package org.sample;

import java.util.Scanner;

//class
public class SampleProgram {
	
	public static void main(String[] args) {
		
	//Scanner ref=new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String nextLine = sc.nextLine();
		System.out.println("your name is : " + nextLine);
		
		System.out.println("Enter your age");
		byte age = sc.nextByte();
		System.out.println("your age is : "+age);
		
		System.out.println("Enter your phone number");
		long phNo = sc.nextLong();
		System.out.println("phone number is  : "+phNo);
		
		System.out.println("Enter your salary");
		int salary = sc.nextInt();
		System.out.println("my salary is : "+salary);
		
		System.out.println("Enter your name");
		String next = sc.next();
		System.out.println("your name is : " + next);
		
		}
	

	}
