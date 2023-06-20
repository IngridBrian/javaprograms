package encapsulation;//binding code n dat into single unit// make data memnrs as pvt and  getter n seter methods as public 

public class Address {

	private String line1;
	
	private String city;
	
	private String state;
	
	private int pin;
	
	public void setline1(String line1){
		this.line1 =line1;
		
	}
	
	
	public void setcity(String city){
		this.city =city;
		
	}
	
	
	public void setstate(String state){
		this.state =state;
		
	}
	
	
	public void setpin(int pin){
		this.pin = pin;
		
	}
	
	
	public String getline1() {
		return line1;
		
	}
	
	public String getcity() {
		return city;
		
	}
	
	public String getstate() {
		return state;
		
	}
	
	public int getpin() {
		return pin;
		
	}
	
}
