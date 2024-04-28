package Collection;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
	
         // Declare Linked List
		//LinkedList <String> m= new LinkedList <String>();
		//LinkedList <Integer> n = new LinkedList <Integer>(); // int 
		
		
		LinkedList m= new LinkedList();
		
		//Add elements into linked list
		
		m.add(100);
		m.add("hello");
		m.add("hello");
		m.add(2.30);
		m.add('A');
		m.add(true);
		m.add(null);
		
		System.out.println(m);
		System.out.println(m.size());
		
		
		//remove
		m.remove(3);
		System.out.println("After removing, this is new list: " + m);
		
		
		// Adding element in the middle of linkedlist
		
		m.add(3, 'C');
		System.out.println("After adding new element, this is new list: " + m); 
		
		
		//retriving value
		
		System.out.println(m.get(4));
		
		
		// change value
		m.set(4, false);
		System.out.println("After changin the value of index 4: " + m); // [100, hello, 2.3, C, false null]
		
		//contains()
		System.out.println(m.contains("hello")); // true 
		System.out.println(m.contains("Bye")); // false
		
		
		
		
	}

}
