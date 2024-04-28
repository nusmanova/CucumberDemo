package Collection;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {
		
		HashSet <Integer> oddnumbers = new HashSet <Integer>();
		
		
		oddnumbers.add(1);
		oddnumbers.add(3);
		oddnumbers.add(5);
		
		System.out.println(oddnumbers);
		
		//addAll
		
		HashSet <Integer> numbers = new HashSet <Integer>();
		
	   numbers.addAll(oddnumbers);
	   numbers.add(7);
	   
	   System.out.println(numbers);
	   
	   //remove all
	   numbers.removeAll(oddnumbers);
	   numbers.remove(7);
	   
	   System.out.println(numbers);
	}

}
