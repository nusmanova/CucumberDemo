package Overloading;

public class MethodOverloading {

	
		static int x=1;
		static int y=2;
		static int z=3;
		
		
	 public static int add ()
		{
			return(z+y);
		}
		
		
		public static int add (int x, int y) 
		{
		return(x+y);
		}
		
		
	public static 	int add  (int x, int y, int z)
		{
			return (x+y+z);
		}
		
		
		
		public static void main(String[] args) {
			
			System.out.println(add ());
		}

	}
