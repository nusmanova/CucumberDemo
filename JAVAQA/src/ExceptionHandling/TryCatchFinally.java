package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		//ArrayIndexOutOfBoundException

				int arr []= new int [5];
				
				try 
				{
				arr[6]=50;
	            }
				
				catch (ArithmeticException e)
				{
					System.out.println(e.getMessage());
				}
				
				finally 
				{
					System.out.println("This is FINALLY block");
				}

}
}
