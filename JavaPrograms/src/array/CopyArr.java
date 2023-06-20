package array;

public class CopyArr {

	public static void main(String[] args)   
	{  
		int arr1[]= new int [] {1,2,3};
		//int arr2[]= new int [arr1.length] ;
		int arr2[]= new int[]{4,5,6} ;
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println("Array length:"+ arr1.length);
		System.out.println("Elements of frsst array: ");  
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
	
			
		}
		
		System.out.println();
		
		
		System.out.println("Array length:"+ arr2.length);
		System.out.println("Elements of Secnd array: ");  
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+ " ");
			
	
	}
		
	}
	}
	
	
	
	

