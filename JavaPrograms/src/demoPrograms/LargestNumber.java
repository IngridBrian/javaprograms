package demoPrograms;
import java.util.Scanner;  
public class LargestNumber {

	
	public static void main(String[] args)   
	{  
	int a, b, c, largest, temp, smallest;  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");  
	a = sc.nextInt(); 
	System.out.println("Enter the 2nd number:");  
	b = sc.nextInt(); 
	System.out.println("Enter the 3rd number:");  
	c = sc.nextInt(); 
//	temp=a>b?a:b;
//	largest=temp>c?temp:c;
//	System.out.println("largest among three:"+ largest);  
	
	temp=a<b?a:b;
	smallest=temp<c?temp:c;
	System.out.println("smallest among three:"+ smallest);  
	
	
	}
	
	
	
	}
