package oops.aggregation;

public class Address3 {
	
	String addr;
	void getAddres(String ad) {
		
		addr=ad;
		System.out.println(addr);

	}
	
	public static void main(String[] args) {
		Student3 s = new Student3();
		s.getDetails("ingrid", 111);
		Address3 a = new Address3();
		a.getAddres("carmel cottage, vaduthala");
		


}
}