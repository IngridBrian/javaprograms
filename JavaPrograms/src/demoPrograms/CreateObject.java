package demoPrograms;
//create a program that uses new keyword to create an object.
//public class CreateObject {
//
//	int a= 10;
//	void show() {
//		System.out.println("Welcome to java");
//	}
//	
//	public static void main(String args[]) {
//		CreateObject cb = new CreateObject();
//		cb.show();
//		System.out.println(cb.a);
//
//		
//	}
//	
//}



//By using the new keyword, we can also invoke the constructor (default or parametrized) of the class.
public class CreateObject {
//constructor of the class    
CreateObject()    
{    
System.out.println("Welcome ");    
}

	public static void main(String[] args) {
//creating an object using new keyword   
		CreateObject ob = new CreateObject();
	}
}