package DSA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listt {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();	
		List<Integer> list2 = new LinkedList<>();	
		list.add(23);
		list.add(12);
		list.add(34);
		list.add(54);
		
		list2.add(67);
		list2.add(6721);
		list2.add(34);
		list2.add(6723);
		
//		Last index tak chalega
		list.add(2,56);
		list.add(5,3);
		
//		Append in the end
		list.addAll(list2);
//		Append at given position
		list.addAll(3, list2);	
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");			
		}
		
//		list.clear();
		
		System.out.println("\n\nSize: " + list.size());
		System.out.println("\n\nContains Y/N: " + list.contains(56));
		System.out.println("\n\nHashcode : " + list.hashCode());
		System.out.println("\n\nIndexof : " + list.indexOf(34));
		
//		index of the last occurrence || -1 if absent
		System.out.println("\n\nLastIndexof : " + list.lastIndexOf(34));
		System.out.println("\n\nisEmpty? : " + list.isEmpty());
		
//		Removes the first occurrence of the specified element from this 
//		list, if it is present.
//		Objects ke liye bhi hai ye
		System.out.println("\n\nRemoved : " + list.remove(3));
		
//		Retain everything present in the list
		System.out.println("\n\nRetainAll : " + list.retainAll(list2));		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "  ");			
		}
		System.out.println("\n\nIndexof : " + list.indexOf(34));
		
//		
//		-----------------Using Foreach Loop------------------------
		for (Integer i : list) {
			System.out.print(i+"  ");
		}
		
//		-----------------Using Lamda Function------------------------
		System.out.println();
		list.forEach(i -> System.out.print(i + ","));
		
		System.out.println();
		list2.forEach(str -> System.out.print(str + ","));
		
//		-----------------Using Traditional Loop
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("  "+i);
		}
		
	
	}
	
}
































