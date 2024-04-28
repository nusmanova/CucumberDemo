package Collection;

import java.util.LinkedList;

public class FaridaLinkedList {

	public static void main(String[] args) {
	

		LinkedList <String> fruit= new LinkedList<String>();
		LinkedList <String> fruits= new LinkedList<String>();
		
		fruit.add(0, "Lemon");
		fruit.add(1, "Lime");
		fruit.addFirst("Berry");
		fruit.addLast("Dragon");
		
		System.out.println(fruit.getFirst());
		System.out.println(fruit.getLast());
		
		System.out.println(fruit.removeFirst());
		System.out.println(fruit.removeLast());
		System.out.println(fruit);
		
	}

}
