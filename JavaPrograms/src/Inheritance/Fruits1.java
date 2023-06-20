package Inheritance;//mechansm of inheiting properies of arent class to another classorchild

public class Fruits1 {

	
	public  Fruits1(){
	System.out.println("parent class constructr");
	
	}
	
	public  Fruits1(int a1){
		System.out.println("parent class constructr" +a1);
		
		}
	
	public  Fruits1(String s){
		System.out.println("parent class constructr" +s);
		
		}
	
	String name ="Exotic fruts";
	int cost = 100;
	static String varient ="Apple";
	public void getName() {
		System.out.println("parent class method:"+name+","+varient);
	}
	
}
