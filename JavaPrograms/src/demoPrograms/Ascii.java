package demoPrograms;
import java.util.Scanner;  
//public class Ascii {
//
//	public static void main(String args[]) {
//		
//		int ch1='a';
//		int ch2='b';
//		System.out.println(ch1);
//		System.out.println(ch2);
//	}
//	
//}
//Type-casting is a way to cast a variable into another datatype.

//
//public class Ascii   
//{  
//public static void main(String[] args)   
//{  
////characters whose ASCII value to be found  
//char ch1 = 'a';  
//char ch2 = 'b';  
////casting or converting a charter into int type  
//int ascii1 = (int) ch1;  
//int ascii2 = (int) ch2;  
//System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);  
//System.out.println("The ASCII value of " + ch1 + " is: " + ascii2);  
//}  
//}  


public class Ascii
{  
public static void main(String args[])  
{  
System.out.print("Enter a character: ");  
Scanner sc = new Scanner(System.in);  
char ch = sc.next().charAt(0);
int ascivalue=ch;
System.out.println("The ASCII value of ch:" + ascivalue);
}
}
