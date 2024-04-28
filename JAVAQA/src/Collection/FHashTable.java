package Collection;

import java.util.Hashtable;

public class FHashTable {

	public static void main(String[] args) {
		

		Hashtable <Integer,String> ht = new Hashtable <Integer, String>();
		
		
		ht.put(101, "Anora");
		ht.put(102, "Farida");
		ht.put(103, "Fariza");
		ht.put(104, "Nasiba");
		ht.put(105, "Sam");
		//ht.put(null, 106); // NullPointerException 
		
		
		System.out.println(ht);
		System.out.println(ht.get(103));
		
		ht.remove(103);
		System.out.println(ht);
		 System.out.println(ht.contains("Sam"));
	}

}
