package Collection;

import java.util.HashMap;

public class FHashMap {

	public static void main(String[] args) {
		

		HashMap hm=new HashMap ();
		
		hm.put(101, "Anora");
		hm.put(102, "Farida");
		hm.put(103, "Fariza");
		hm.put(104, "Nasiba");
		hm.put(105, "Sam");
		
		
		System.out.println(hm); // {101=Anora, 102=Farida, 103=Fariza, 104=Nasiba, 105=Sam}
		System.out.println(hm.get(104)); // Nasiba 
		
		System.out.println(hm.containsKey(102));// true 
		System.out.println(hm.containsKey(107)); // false
		
		System.out.println(hm.containsValue("Mary")); // false
		System.out.println(hm.containsValue("Farida")); //true
		
		System.out.println(hm.isEmpty()); // false 
		
		System.out.println(hm.keySet());// returns all the keys as SET
		
		System.out.println(hm.values()); // returns all the value as set 
		
		
		
		for (Object i:hm.values())
		{
			System.out.println(i);
		}
		
		
		
		for (Object f:hm.keySet()) 
		{
			System.out.println(f);
		}
		
	}

}
