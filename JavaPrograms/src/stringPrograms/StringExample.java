
package stringPrograms;

public class StringExample {
	
	
	String s1 = "java";//string literal
	String s2="JAVA";
	String s3="version";
	char ch[]= {'a','n','u'};

	String s4=new String(ch); // uing new kw
	
		public void stringMethods() {
			
	//	System.out.println(s1);
	///	System.out.println(s2);
/////		System.out.println(s4);
		System.out.println(s4.length());
		System.out.println(s4.charAt(2));
		System.out.println(s4.indexOf('b'));
		System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s4.contains("a"));
		System.out.println(s4.substring(1));
		System.out.println(s4.substring(0,2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.replace("av","AV"));
		System.out.println(s1.substring(0,1));
		System.out.println(s1.concat(s2));
		int i=1234;
		String ii=String.valueOf(i);
		System.out.println(ii);
		
		}	
		
		void mutableMethods() {
	
			StringBuilder sb=new StringBuilder(s1);
			System.out.println(sb);
			sb.append("tutorial");
			System.out.println(sb);
			System.out.println(sb.reverse());
			
		
		}
		public static void main(String args[]) {
			
			
			StringExample se = new StringExample();
			se.stringMethods();
			se.mutableMethods();
			
		}
		
		
	
	
	
	
}
