package ExceptionHandling;

public class FaridaHomwork {

	public static void main(String[] args) {
		
		String h=null;
		 try
		 {
		   System.out.println(h.length());
		 }

		catch (NullPointerException e)
		 {
		  System.out.println(e.getMessage());
		 }
		 finally
		 {

		 System.out.println("this is exception");
		  
		 }
		 
		 
		 
		//NumberFormatException
		 String t="farida";
		 int y[]=new int [4];
	
		 try
		 {
			 y[2]=89;

		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
		   System.out.println(e.getMessage());
		 }
		 finally
		 {
		   System.out.println("i can't do this");
		 }
		 
		 ////ArrayIndexOutofBound
		 
		 int n[]=new int[4];
		 
		 try
		 {
		   n[3]=90;
		 
		 }
		 
		   catch(ArrayIndexOutOfBoundsException e)
		 {
		     System.out.println(e.getMessage());
		 }
		 


	}

}
