package Inheritance;

public class GreenApple2 extends Fruits1 
{
	public GreenApple2() {
		System.out.println("multi level Child class constructor: Green Apple");
	}

	public void print() {
		
		System.out.println("Child class mtd: Green Apple");
	}
	
public static void main(String args[]) {
		
		GreenApple1 gp=new GreenApple1(); //agregation
		gp.print();
		gp.getCost();
		gp.getName();

}
}