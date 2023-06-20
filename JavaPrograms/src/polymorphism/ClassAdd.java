package polymorphism;

public class ClassAdd extends Addition{
	
	@Override
	public int findSum(int a, int b) {
		return s=a+b+110;
	}
	
	public static void main(String args[]) {
		//ClassAdd ob= new ClassAdd();// child class object
		Addition ob = new ClassAdd();
		System.out.println(ob.findSum(10,5));
		
		
	}
	
	
}
