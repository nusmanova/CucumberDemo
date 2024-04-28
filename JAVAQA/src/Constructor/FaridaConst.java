package Constructor;

public class FaridaConst {

	int l;
	String m;
	
	
	FaridaConst() // default 
	{
		l=25;
		m="Farida";
	}
	
	
	
	
	FaridaConst(String c) // parametr
	{
		m=c;
		
	}
	
	
	
	FaridaConst(String x, int y) // parametr
	{
		m=x;
		l=y;
		
	}
	
	
	public static void main(String[] args) {
	
		FaridaConst fc= new FaridaConst("ALice", 15); // this is object
		FaridaConst fc1 = new FaridaConst("Nasiba");
		FaridaConst fc2 = new FaridaConst();
		
		System.out.println(fc.m + " " + fc.l);
		System.out.println(fc1.m);
		System.out.println(fc2.m + " " + fc2.l);
		
		
		

	}

}
