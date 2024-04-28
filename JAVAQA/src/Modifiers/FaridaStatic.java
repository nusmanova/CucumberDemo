package Modifiers;

public class FaridaStatic {

	int p;
	
	static int z= 25;
	
	
	
	static void test1()
	{
		 System.out.println(z);
	}
			
	
	
	void test2()
	{
		System.out.println("Default method is non access modifiers");
	}
	
	public static void main(String[] args) {
		
		test1();
		
		FaridaStatic fs= new FaridaStatic();
		fs.test2();
		
	}

}
