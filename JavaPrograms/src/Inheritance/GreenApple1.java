package Inheritance;

public class GreenApple1 extends Apple1 {
	
	public GreenApple1() {
		System.out.println("multi level Child class constructor: Green Apple");
	}

	public void print() {
		getCost();
		System.out.println("Child class mtd: Green Apple");
	}
	
public static void main(String args[]) {
		
		GreenApple1 gp=new GreenApple1(); //agregation
		gp.print();
	}
}

