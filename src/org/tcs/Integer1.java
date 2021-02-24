package org.tcs;

public class Integer1 {
	
	public static void main(String[] args) {
	//		1
		int a = 10;
		
		//  Break 			Continue			System.exit(0) 
		
		for (int i = 0; i < a; i++) {
			
			if (i == 5) {
				break;
				
			}
			
			System.out.println(i);
			
		}
		System.out.println("Success");
	
	}
}
//			1			2			3		4
//		a=7				7			7+1=8	8<10t		
//		a=8				8			8+1=9	9<10t	
//		a=9				9			9+1=10	10<10f.........terminates	









