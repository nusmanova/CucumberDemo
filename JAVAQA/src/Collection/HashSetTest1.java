package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetTest1 {

	public static void main(String[] args) {
		
		//declare
		
		//HashSet hs= new HashSet(100); // initial capacity 100
	    //HashSet hs = new HashSet (100, (float) 0.90);
		//HashSet <Integer> hs= new HashSet <Integer>();
		
		
		//HashSet hs= new HashSet(); // default 16 capacity  Load factor 0.75  do not follow insertion order
		
		LinkedHashSet hs =  new LinkedHashSet(); // follow insertion order
		
		// add
		
		hs.add(85);
		hs.add("Hi");
		hs.add(25.4);
		hs.add('A');
		hs.add(null);
		hs.add(true);
		
		System.out.println(hs);
		
	/*	//remove
		hs.remove(85);
		System.out.println("After removing the element: " + hs);
		
		//contains() // boolean 
		
		System.out.println(hs.contains("Hello")); // false
		System.out.println(hs.contains(85));
		
		System.out.println(hs.isEmpty());
		
		//reading the element from hashset using for ...loop
		
		/*for(Object e:hs) 
		{
			System.out.println(e);
		}*/
		
		
		/*Iterator it = hs.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		*/

	}

}
