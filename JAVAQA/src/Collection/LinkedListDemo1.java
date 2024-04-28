package Collection;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		
		LinkedList l= new LinkedList();
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("F");
		
		LinkedList newl= new LinkedList();
		newl.addAll(l);
		System.out.println(newl);
		System.out.println(newl.size());
		
		newl.removeAll(l);
		System.out.println(newl);
	}

}
