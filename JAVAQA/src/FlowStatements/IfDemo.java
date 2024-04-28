package FlowStatements;

public class IfDemo {

	public static void main(String[] args) {
		
		// int data type
		int age = 14; 
		
		
		if (age >=18) 
		{
			System.out.println("Eligible for Driving Licence");
		}
		else
		{
			System.out.println("Not Eligible for Driving Licence");
		}
		
		
		
		
		///////char /////////
		
		char number = 'A'; // 65
		
	
		if (number >= 65)
		{
			
			System.out.println(" American code matched");
		
		}
	    else
	    {
	    	System.out.println(" American code unmatched");
	     }
	
		
		
	////////// string /////////////
		
		String phone= "Apple";
	 if (phone.length()>= 5) 
	 {
		 System.out.println("True");
	 }
	 
	 else 
	 {
		 System.out.println(" False");
	 }
	
		
		System.out.println("Test run");
		
		
		
		
		
		
		
	}

}
