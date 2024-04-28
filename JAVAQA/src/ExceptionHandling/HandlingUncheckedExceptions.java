package ExceptionHandling;

public class HandlingUncheckedExceptions {

	public static void main(String[] args) {
		
		
		System.out.println("the program is started");
		
		int n=25;
		
		try
		{
		System.out.println(n/0); //ArithmeticException 
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
			
		}
		
		
		//NullPointerException 
		
				String f= null;
				
			try 
			{	
				System.out.println(f.length());
			}
			
			catch (NullPointerException e)
			{
				System.out.println(e.getMessage());
			}
		
		
		System.out.println("the program is in progress");
		System.out.println("the program is completed");

	}

}
