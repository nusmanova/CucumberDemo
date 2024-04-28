package ExceptionHandling;

public class HandlingCheckedException {

	public static void main(String[] args)  {
		
		System.out.println("the program is started");
		System.out.println("the program is in progress");
		
		try {
		Thread.sleep(4000);
		}
		
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
				
		System.out.println("the program is completed");
		System.out.println("the program is exited");

	}

}
