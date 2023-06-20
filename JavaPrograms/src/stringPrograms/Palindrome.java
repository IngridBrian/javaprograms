package stringPrograms;
import java.util.Scanner;


public class Palindrome {
	 String rev="";//instance variable
	
	
	public void getReverse(String str){
		
		 for (int i = str.length() - 1; i >= 0; i--) {//noned ofreturn type
	            rev = rev + str.charAt(i);
	           
	        //    System.out.println(rev);  
	        }
		 
	}
	
	public void isPalindrome(String str) {
		
		if(str.equals(rev)) {
			
			System.out.println("The  given string is   palindrome: " + str);
		}else {
			System.out.println("The  given string is not  palindrome: " + str);
		}
	}
	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
        p.getReverse(str);
        p.isPalindrome(str);
    
}
	
	
}
