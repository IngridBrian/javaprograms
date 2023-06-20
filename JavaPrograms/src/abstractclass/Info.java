package abstractclass;//hiding implementatondetails anduser can see only functionlity 

public abstract class Info {//abstract KW
	
	Info(){
		
		System.out.println("parent class");
		
	}

	abstract void getName(String name); //abstract mtds
	abstract void getAge();
	
	
}
