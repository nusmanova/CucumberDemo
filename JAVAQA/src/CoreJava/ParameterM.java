package CoreJava;

public class ParameterM {

	int x=10;   
	int y=20;
	
	
	
	/*void sum1 () // Case 1- not taking parameters and also not returning value
	{
		System.out.println(x+y);
	}*/
	
	
	
	/*int sum2() // Case 2 not taking parameters and returning value
			{
		return (x+y);   // return bu qiymat qaytarib berida 
			}*/
	
	
	/*void sum (int a, int b) // Case 3 taking parameters , but not returning value
	{
		System.out.println(a+b);
	}*/
	
	
	
	 int sum4(int a, int b) // Case 4  taking parameters and returning value
	 {
		 return (a+b);
	 }
	
	
	
	public static void main(String[] args) {
		
		ParameterM pm1=  new ParameterM();
		
		//pm1.sum1(); // Case 1
		
		//System.out.print(pm1.sum2());  // Case 2
		
		//pm1.sum(15, 25);
		
		System.out.println(pm1.sum4(30, 20));
		
		
		
	
	}

}
