package oops.aggregation;

public class CalcHrPf2{
	
	public float getHra(float basicSal) {
		float hra;
		hra = 0.5f *basicSal;
		return hra;
	}
	
	public float getPf(float basicSal) {
		
		float pf;
		pf= 0.2f * basicSal ;
		return pf;
	}

	
	

}
