package array;

public class Duplictate {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 2, 8, 8 };
		System.out.println("Array length:" + a.length);
		System.out.println("Elements of given array: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}

			}

		}

	}
}


