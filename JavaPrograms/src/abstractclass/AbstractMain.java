package abstractclass;

public class AbstractMain {
	
 public static void main(String ags[]) {
	 
	 Info i1= new Student();
	// Student i1=new Student();
	 i1.getAge();
	 i1.getName("Ingrid");
	 

	 Info i2= new Employee();
	 i2.getAge();
	 i2.getName("");
	 
	 
 }
	
	
	
}
