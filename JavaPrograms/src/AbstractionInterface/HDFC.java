package AbstractionInterface;

public class HDFC implements RBI {

	@Override
	public int recurringDeposit(int amount, int duration) {
	int intereststrate=amount*duration;
	return intereststrate;
	}
	
	
     public static void main(String args[]) {
    	 RBI r= new HDFC();
    	System.out.println(r.recurringDeposit(500,24));
     }
}
