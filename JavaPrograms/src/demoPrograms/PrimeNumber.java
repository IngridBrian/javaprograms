package demoPrograms;

public class PrimeNumber {

	 
	public static void main(String args[]) {
		int num=6;
		int m=num/2;
		 int flag = 0;
		if((num==0 || num==1)){
			System.out.println("its not prime number");
		}else {
			for(int i=2;i<=m;m++) {
				if(num %1==0) {
					System.out.println(num +"num is not parme" );
					flag=1;
					break;
				}
			}
		if(flag==0) {
			System.out.println(num+" is prime number"); 
			}  
		}
			
			
		}
}		
