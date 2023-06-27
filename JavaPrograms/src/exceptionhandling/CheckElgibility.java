package exceptionhandling;

public class CheckElgibility {

	public void validateAge(int age) {
		if(age>=18) {
			System.out.println("Elgible");		
		}else {
		throw new ArithmeticException("age less than 18");
	//	throw new Exception("age less than 18");
		}
	}
	
	public static void main(String args[]) {
		CheckElgibility ce= new CheckElgibility();
		try { //exception handling
		ce.validateAge(17);
		}catch(ArithmeticException e){
		System.out.println(e.getLocalizedMessage());
		//System.out.println(e.fillInStackTrace());
	}
	
	}
}
