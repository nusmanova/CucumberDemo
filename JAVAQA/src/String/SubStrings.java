package String;

public class SubStrings {

	public static void main(String[] args) {
		
		
		// LENGTH()  ----- returns count of the total letters  // umumiy harflar sonini sanab beradi
		
		String f ="Farida"; // 6 
		String t ="Toshpulatova";
		String m = "Maktab";
		
		
		System.out.println(f.length());
		System.out.println(t.length());
		System.out.println(m.length());
			
	
	//  Concatenation ------------ qushib chiqarib berdi ikki qiymatni
				
		System.out.println(f.concat(m));
		

	// trimming the string -----  qaychilab berish
		
				 String f2 = "      Farida       ";
				 String m2 = "    Maktab          ";
				 
				
				System.out.println("This is before trimming string:" + f2); // Farida
				System.out.println("This is after trimming string:" + f2.trim()); 
				
				System.out.println(m2);
				System.out.println(m2.trim());
				
				
	// chatAt----returns  a char value at the given index number.
				
				f= "Faridakhon";
				
				System.out.println(f.charAt(3));
				System.out.println(f.charAt(9));
				
				
	// contains --- boolean type and it returns  true or false
				
				System.out.println(f.contains("khon")); // true  Faridakhon has khon words
				
				System.out.println(f.contains("Khon")); // False 
				
		         System.out.println(f.contains("farida")); //false 
		        
		//equals ---boolean,  it compares the two strings 
		 		
		         System.out.println(f.equals("farida"));  // false 	
		        
		          System.out.println(f.equals("Farida"));  //false
		          
		          System.out.println( f.equals("Faridakhon"));// true 
		          
     // equalsIgnorecase-- boolean it does not check case like equals (), it checks if it is matched 
		  		
		          System.out.println(f.equalsIgnoreCase("faridakhon")); // true 
		          System.out.println(f.equalsIgnoreCase("Farida")); // false
		  
	// replace  we have four types 
		  		
		  		f= "Farida Toshpulatova";
		  		
		  		System.out.println(f.replace('a', 'e')); // 1 type replace  char 
		  		System.out.println(f.replace('i', 'a'));
		  		
		  		System.out.println(f.replace("Toshpulatova", "Baxtiyorovna")); // replace the value
		  		System.out.println(f.replace("Farida", "Sofia"));
		  		
		  		System.out.println(f.replaceFirst("Fari", "Fere"));
		  		System.out.println(f.replaceAll("a", "e")); // double string 
		  		
		  		
		  	// Substring --  returns substring of a string based on starting index and ending index 
                // starting index starts from 0 1 2 3 4 5 etc;   ends index starts from 1 2 3 4 5 etc
       
		  	String	p3 = "Welcome";
	
            String p4 = "Codekaplan"; 

           System.out.println(p3.substring(0, 2)); // char

System.out.println(p3.substring(0, 4)); // string
System.out.println(p3.substring(2, 4));
System.out.println(p4.substring(3, 7));
 

//Index of 

	  p3= " Hello planet earth, you are a great planet";
	  
	  System.out.println(p3.indexOf("planet"));
	  
	  
		//LowerCase - returns the string in lower letter 
	  
	  String zi ="NaPerviLle";
		
	    System.out.println(zi.toLowerCase());
	    
	    // UpperCase -  returns the string in Upper letter 
	    
	   System.out.println(zi.toUpperCase());  
	   
	// Contains equal ---  String da belgilar ketma-ketligi mavjudkigini aniqlaydi 
		  p3= "Hello";
		  
		  System.out.println( p3.contentEquals("Hello")); // true  
		  System.out.println( p3.contentEquals("e"));    // false 
		  System.out.println( p3.contentEquals("Hel"));
		         
	}

}
