package array;

public class Sum {

	public static void main(String[] args)   
	{  
		int a[]= new int [] {1,2,3,4,5,6};
		int sum=0;
		System.out.println("Array length:"+ a.length);
		System.out.println("Elements of given array: ");  
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
			System.out.print(sum);
	

	
	}
}
