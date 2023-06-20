package array;

public class EvenPos{
	
	public static void main(String args[]){
		int a[]=new int[] {1,2,3,4,5,6};
//		for (int i=0;i<a.length;i=i+2) {//odd
//		 	System.out.print(a[i] + " ");
//		}
		
		
		for (int i=1;i<a.length;i=i+2) {//even
		 	System.out.print(a[i] + " ");
		}
		
		
		
	}

}
