package ExceptionHandling;

public class UncheckedExcemtions {

	public static void main(String[] args) {
		
		
		//ArithmeticException 
		
		int n=25;
		//System.out.println(n/0);
		
		
		//NullPointerException 
		
		String f= null;
		//System.out.println(f.length());
		
		
		//NumberFormatException
		
		String st="Farida";
		//int p = Integer.parseInt(st);
		//System.out.println(p);
		
		//ArrayIndexOutOfBoundException

		int arr []= new int [5];
		
		arr[10]=50;
		
	}

}
