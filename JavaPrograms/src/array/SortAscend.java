package array;

public class SortAscend {
	public static void main(String[] args)   
	{  
		int a[]= new int [] {11,2,30,4,55,6};
		int temp=0;
		System.out.println("Array length:"+ a.length);
		System.out.println("Elements of ordgnal array: ");  
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	
			
			System.out.println("Elements after Sortng array: ");  
		//	int min;
			for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
					
				System.out.print(temp+ " ");
//				min=a[i];
//				a[i]=a[j];
			}
				
	}
}
