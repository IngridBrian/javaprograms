package demoPrograms;

public class SwapNumber {

	int a, b, temp;
	void swap(int a, int b) {
		
		temp=a;
		a=b;
		b=temp;
	 	System.out.println(a);
	 	System.out.println(b);
	 	

	}
	
	public static void main(String args[]) {
		SwapNumber s= new SwapNumber();
		s.swap(10, 20);
	}
}
