package Constructor;

class Farida {

	
	public Farida ()
	{
		System.out.println("This is Farida class default");
	}
	
	
	 public Farida (int f)
	{
		System.out.println("This is Farida class int F");
	}
	
}
	
 

class Nasiba extends Farida {
		 
		 public Nasiba ()
		 {
			
			 System.out.println("This is Nasiba class default");
		 }
		 
		 
		 public Nasiba (int f)
		 {
			 super(f);
			 System.out.println("This is Nasiba f int");
			 
		 }
}
		 
		 public class FaridaSC{
			 
			 public static void main(String[] args) {
				 
				 
				 Nasiba obj= new Nasiba(35);
				 System.out.println(obj);
				 
				 
			 }
		 }
 

		 
	 
	 
	
	
	
	
		

	
