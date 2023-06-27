package exceptionhandling;

public class Operations {

	int a = 10, b = 10;

	public void div() {

		try {
			try {//nested try
				System.out.println(a / 0);
			} catch (ArithmeticException ae) {
				System.out.println(ae.getMessage());
			}
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}

	public static void main(String args[]) {
		Operations op = new Operations();
		op.div();
	}

}
//try wllbe followed by either catch or finally