package Collection;

import java.util.ArrayList;

public class FaridaArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> fruits= new ArrayList <String>();
		
		
		fruits.add(0,"Apple");
		fruits.add(1,"Pear");
		fruits.add(2,"Kiwi");
		fruits.add(3, "Banan");
		
		
		
		System.out.println(fruits.get(2));
		System.out.println(fruits);
	}

}
