
package oops.aggregation;

public class Salary2 {
	
  float getTotSal(float basicSal,float bonus,float deduction) {
	    float totSal;
	    CalcHrPf2 c= new CalcHrPf2();
	    totSal = basicSal + bonus -deduction+c.getHra(basicSal)-c.getPf(basicSal);
		return totSal;
	}
	
	
	public static void main(String[] args) {
			
		
		Employee2 e = new Employee2();
	
		e.getData();
		CalcHrPf2 c= new CalcHrPf2();
		Salary2 s= new Salary2();
		float totalsalary=s.getTotSal(e.basicSal,e.bonus,e.deduction);
		System.out.println("Salary Slip");
		System.out.println("basic pay:"+ e.basicSal);
		System.out.println("bonus is:"+ e.bonus);
		System.out.println("deduction is:"+ e.deduction);
		System.out.println("HRA is "+ c.getHra(e.basicSal));
		System.out.println("PF is "+ c.getPf(e.basicSal));
		System.out.println("total salary is "+ totalsalary);
	

		}
}