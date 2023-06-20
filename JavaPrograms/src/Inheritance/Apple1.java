package Inheritance;

public class Apple1 extends Fruits1 { // inhertance using extends KW
	
	
	public Apple1() {
			//super();
		System.out.println("Single inhrtance:Child class constructr:"+ Apple1.varient); //inheriting static variable of parent class
	}
	
	public Apple1(int a) {
	super(5);
			System.out.println("chld clas parametrzed const:"+a); 
		}
	
	
	public void getCost() {
			
			System.out.println("parent class Cost & name :"+super.cost+" "+super.name);//inheriting instance variable of parent class
			super.getName();
		
		}
	
	
	
	

}




