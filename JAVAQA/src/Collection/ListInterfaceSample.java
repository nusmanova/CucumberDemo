package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceSample {

	public static void main(String[] args) {
		
 
		
		List l1= new ArrayList();
		List<String> l2= new ArrayList<String>();
		
		
		l1.add(0, 10);
		l1.add(1, 20);
		
		l2.add(0, "Tech");
		l2.add(1, "Class");
	    l2.add(2, "Java");
	    
	    
	    l1.addAll(1, l2);
	    System.out.println("\nElements of list1: "  + l1);
	    
	    System.out.println("\nElements at index 3: "  + l1.get(3));
	    
		
		
		
	}

}
