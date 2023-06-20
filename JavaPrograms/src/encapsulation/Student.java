package encapsulation;

public class Student {

	private String name;
	private int rollno;
	private Address address;//aggregation
	
	public void setName(String name) {
		this.name =name;
	//private Address address;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNo(int rollno) {
		this.rollno =rollno;
		
	}
	
	public int getRollNo() {
		return rollno;
	}
	
	public void setAddress(Address address) {
		this.address =address;
	
	}
	
	public Address getAddress() {
	return address;
		
	}
	
	
	
}
