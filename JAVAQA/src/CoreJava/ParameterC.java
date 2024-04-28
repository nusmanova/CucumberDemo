package CoreJava;

public class ParameterC {

	
	int x;
	int y;
	
	/*ParameterC()   // default constructor 
	{
		x=10;
		y=20;
	}*/
	
	
	
	ParameterC (int a, int b)
	{
		x=a;
		y=b;
	}
	

	
	void diplay ()
	{
		System.out.println(x+y);
	}
	

	
	public static void main(String[] args) {
		
		//ParameterC pc= new ParameterC  // default constructor 
		
		
		ParameterC pc= new ParameterC(10, 20); // invokes parameter
		ParameterC pc2 = new ParameterC (30, 30);
		
		
		pc.diplay();
		pc2.diplay();
		

	}

}
