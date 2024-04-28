package FlowStatements;

public class FaridaIfelse {

	public static void main(String[] args) {
		
		int student = 21;
		
	
		
		if (student ==18)
		{
			System.out.println("Eligible for vote");
		}
			
		else
		{
			System.out.println("Not Eligible for vote");
		}
		
		
		
		char number = 'e'; // 97
		
		
		if (number >= 250)
		{
			
			System.out.println(" American code matched");
		
		}
	    else
	    {
	    	System.out.println(" American code unmatched");
	     }

		
		String school= "Elementry";
		
		if (school.length() == 11)
		{

		System.out.println(" right");
		
		} 
		else if(school.length()>= 11)
		{
			System.out.println("wrong");
			
		}
		
		else
		{
			System.out.println(" test failed");
		}
		
		
		
		int child = 16;
		
		if (child >= 18)
		{
			System.out.println(" valid for passport");
		}
		
		else if (child ==16)
		{
			System.out.println(" invalid for passport");
		}
		
		else 
		{
			System.out.println(" failed passport");
		}
	}

}
