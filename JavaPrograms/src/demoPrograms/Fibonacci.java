package demoPrograms;

public class Fibonacci {

//	fibonacci series, next number is the sum of previous two numbers
//	for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

	public static void main(String args[]) {
		
		int num1=0;
		int num2=1;
		int count=10;
		
		int num3;
		int i;
		System.out.println(num1);
		System.out.println(num2);
		for(i=0;i<count;i++) {
			
			num3 = num1+num2;
			
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
		
		
		
	}
	
	
}
