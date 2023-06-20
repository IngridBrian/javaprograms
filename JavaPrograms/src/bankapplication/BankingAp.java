package bankapplication;
import java.util.Scanner;
public class BankingAp {
	
static	float accbalance=5500;
	 
		float getBalance()
		{
	
		return accbalance;
					
		}

		 float getDeposit(float amount){
			

		accbalance = accbalance+ amount;
		System.out.println("amount deposited Successfully");
		return accbalance;
		}



		float getWithdraw(float amount){
				if (accbalance > amount){
					System.out.println("withdraw is possible" + amount );	
					accbalance = accbalance-amount;
					System.out.println("amount withdrawed Successfully");
					System.out.println("New Account Balance:"+ accbalance );
					return accbalance;
				}else {
		
					System.out.println("amount is insufficient, withdraw not possible");		
				return accbalance;
					}
		}
		
	  public static void main(String args[]){
			
		
		BankingAp b = new BankingAp();
		
	/*	System.out.println(b.getBalance(5000.0f));
		System.out.println(b.getDeposit(5000.0f));
		System.out.println(b.getWithdraw(2000.0f));	*/

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the inputs 1. Accunt Balance 2.Deposit 3.withdraw");
		int ch  = sc.nextInt();
		if(ch==1){
//			System.out.println("Enter the amount");
//			amount  = sc.nextFloat();
			System.out.println("Account balance:"+ b.getBalance());
		
			}else if(ch==2){

				System.out.println("Enter the amountto be deposited");
				float amount = sc.nextFloat();
				System.out.println("New Account Balance:"+ b.getDeposit(amount));
				
				
			}else if (ch==3){

				System.out.println("Enter the amount to be withdwad");
				float amount  = sc.nextFloat();
				b.getWithdraw(amount);
			}else{
					System.out.println("invalid choice");	
				}	
	  }
	}
		



