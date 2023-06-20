package oops.aggregation;

public class Divisible1 {
	
	public static void main(String[] args) {
		
		Addition1 obj  = new Addition1();//ifaclas having entityrefernce of another class //agregation
		int result = obj.add(10,7);
		if(result%10==0){
			System.out.println("Dvisble by 10");
			
		}else
		{
			System.out.println("Not Dvisble");
		}
		
	}
}


