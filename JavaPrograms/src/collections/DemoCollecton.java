package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class DemoCollecton {
	public void demo() {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Mango");
		list.add(3,"Banana");
		System.out.println(list.size());
		System.out.println(" List is :"  +list);
		list.set(2,"kiwi");
		System.out.println(list.get(0));
		System.out.println(" List is :"  +list);
		list.add("pineapple");
		System.out.println(list.size());
		System.out.println(" List is :"  +list);
		list.remove(0);
		list.remove("kiwi");
		list.clear();
		System.out.println(" List is :"  +list);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		arrList.add(123);
		arrList.add(200);
		arrList.add(300);
		arrList.add(1111);
				
		arrList2.add(100);
		arrList2.add(200);
		arrList2.add(300);
		arrList2.add(400);
		arrList2.add(1000);
		arrList2.add(3,600);
		arrList2.addAll(arrList);
		
		System.out.println(" ArrayList is :"  +arrList);
		System.out.println(" ArrayList2 is :"  +arrList2);
		arrList2.removeAll(arrList);
		System.out.println(" ArrayList2 is :"  +arrList2);
		System.out.println(arrList2.contains(arrList));
		arrList2.retainAll(arrList);
		System.out.println(" ArrayList2 is :"  +arrList2);
		
		Set<String> set = new HashSet<String>();
		set.add("fruits");
		set.add("vegg");
		set.add("fruits");
		set.add("vege");
		System.out.println("SET" + set);
		
		Map <Integer,String> map = new HashMap<Integer,String>();
		map.put(01,"data1");
		map.put(02,"data2");
		map.put(03,"data1");
		map.put(01,"data3");
		System.out.println("MAP" + map);
		
		
	}
		
		public static void main(String args[]) {
		
			DemoCollecton d= new DemoCollecton();
			d.demo();
		}


		
		

	}


