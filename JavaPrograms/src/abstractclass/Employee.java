package abstractclass;

public class Employee extends Info {
	
	@Override
	void getName(String name) {
		
		System.out.println("employee");
	}

	@Override
	void getAge() {
			
			System.out.println(28);
		}


}
