package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FaridaIteration {

	public static void main(String[] args) {
	
		ArrayList<Integer> age = new ArrayList<Integer>();
		
		age.add(25);
		age.add(36);
		age.add(40);
		age.add(50);
		
		
		Iterator <Integer> value =age.iterator();
		
		System.out.println(value.next());
		System.out.println(value.hasNext()); // true
		
		
		while(value.hasNext()) 
		{
			System.out.println(value.next());
		}

	}

}
