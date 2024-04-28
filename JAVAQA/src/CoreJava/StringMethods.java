package CoreJava;

public class StringMethods {

	public static void main(String[] args) {
		
		
		// There are two ways to create String object:
		
		//String sm = new String ("Welcome");
		
		String s = "Welcome";
		String s1 = "to Java Language";
		
		
		// -------------String methods------------------
		
		// LENGH  ----- returns count of the total letters  // umumiy harflar sonini sanab beradi

		
		System.out.println(s.length());
		System.out.println(s1.length());
		
		
		//  Concatenation ------------ qushib chiqarib berdi ikki qiymatni
		
		
		System.out.println(s.concat(s1));
		
		
		// trimming the string -----  qaychilab berish
		
		//s = "       welcome        ";
		
		System.out.println("This is before trimming string:" + s);
		System.out.println("This is after trimming string:" + s.trim());
		
		
		// chatAt----returns  a char value at the given index number.
		
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(6));
		
		// contains --- boolean type and it returns  true or false
		
		System.out.println(s.contains("wel"));   // S was Welcome  - wel   
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("come")); // true 
		
		
		//equals ---boolean,  it compares the two strings 
		System.out.println(s.equals("Welcome"));  // demak s= "Welcome" teng "Welcome"  true 
		System.out.println(s.equals("welcome"));  // demak S teng "welcome"  false
		
		
		// equalsIgnorecase-- boolean it does not check case like equals (), it checks if it is matched 
		
		System.out.println(s.equalsIgnoreCase("welcome"));  //true
		System.out.println(s.equalsIgnoreCase("Welcome")); // true
		
		
		// replace  we have two types 
		
		s = "Welcome to Java";
		
		System.out.println(s.replace('e', 'a')); // 1 type replace  char  Walcoma to Java 
		System.out.println(s.replace("Java", "Python")); //  2 type replace the value Welcome to Python
		System.out.println(s.replace("to", "in"));

		System.out.println(s.replaceFirst("Welcome", "Back"));
		System.out.println(s.replaceAll("Java", "Python"));
			
	
		// Substring --  returns substring of a string based on starting index and ending index 
		                 // starting index starts from 0 1 2 3 4 5 etc;   ends index starts from 1 2 3 4 5 etc
		 s = "Welcome";
		 s1 = "Codekaplan";
		 
		 System.out.println(s.substring(1,3)); // char
		 System.out.println(s.substring(0, 4)); // string
		 System.out.println(s.substring(2, 4));
		System.out.println(s1.substring(3, 7));
		
		
		//LowerCase - returns the string in lower letter 
		
	    System.out.println(s.toLowerCase());  // welcome 
	    
	    // UpperCase -  returns the string in Upper letter 
	    
	    System.out.println(s.toUpperCase());  // WELCOME
		
		
	    //Compare and compareto ignore case  -- returns  int 
	   
	    s= "HELLO";
	    s1 ="hello";
	  System.out.println(s.compareTo(s1));
	  System.out.println(s.compareToIgnoreCase(s1));
	  
	  
	  // Contains equal ---  String da belgilar ketma-ketligi mavjudkigini aniqlaydi 
	  s= "Hello";
	  
	  System.out.println( s.contentEquals("Hello")); // true 
	  System.out.println( s.contentEquals("e"));    // false 
	  System.out.println( s.contentEquals("Hel"));
	  
	  
	  // Index of 
	  
	  s= " Hello planet earth, you are a great planet";
	  
	  System.out.println(s.indexOf("planet"));
	
	}

}
 