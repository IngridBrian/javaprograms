package exceptionhandling;

public class CheckedThrows {

	public void validateAge(int age) throws InterruptedException, Exception {
		if (age >= 18) {
			System.out.println("Elgible");
			Thread.sleep(10000);
		} else {

			throw new Exception("age less than 18");
		}
	}

	public static void main(String args[]) throws InterruptedException, Exception {
		CheckedThrows ce = new CheckedThrows();
		try { // exception handling
			ce.validateAge(17);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());

		}
		System.out.println("code execution");
	}
}
