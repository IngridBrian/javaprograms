package Abstraction;

public class HDFC implements RBI {

	@Override
	public void recurringDeposit(float amount, int duration) {
		
		
	}
	
	
     public static void main(String args[]) {
    	 RBI r= new HDFC();
    	 r.recurringDeposit(500.0f,24);
     }
}
