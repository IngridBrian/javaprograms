package oops.aggregation;

import java.util.Scanner;

public class Employee2 {

float basicSal, bonus, deduction;
	
	void getData() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic sal");
		basicSal=sc.nextFloat();
		System.out.println("Enter the bonus");
		bonus=sc.nextFloat();
		System.out.println("Enter the deductiom");
		deduction=sc.nextFloat();
		
	}
	
	
	
}

