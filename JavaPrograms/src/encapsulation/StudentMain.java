package encapsulation;

public class StudentMain {

	public static void main(String args[]) {
		Student s= new Student();
		s.setName("ingrid");
		System.out.println(s.getName());
		s.setRollNo(1);
		System.out.println(s.getRollNo());
		
		Address ad= new Address();
		ad.setcity("city");
		ad.setline1("address line ");
		ad.setstate("state");
		ad.setpin(111);
		s.setAddress(ad);
		
		System.out.println(s.getAddress().getline1());
		System.out.println(s.getAddress().getcity());
		System.out.println(s.getAddress().getstate());
		System.out.println(s.getAddress().getpin());	
		
	}
}
