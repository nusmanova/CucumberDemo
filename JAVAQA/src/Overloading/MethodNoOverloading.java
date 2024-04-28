package Overloading;

public class MethodNoOverloading {

	int x=1;
	int y=2;
	int z=3;
	
	
	int add1 (int z, int y)
	{
		return(z+y);
	}
	
	
	int add2 (int x, int y) 
	{
	return(x+y);
	}
	
	
	int add3  (int x, int y, int z)
	{
		return (x+y+z);
	}
	
	
	
	public static void main(String[] args) {
		
		MethodNoOverloading mno= new MethodNoOverloading();
		System.out.println(mno.add3(2, 4, 6));
	}

}
