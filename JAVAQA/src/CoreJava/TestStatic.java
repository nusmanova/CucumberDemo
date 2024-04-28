package CoreJava;

public class TestStatic {


	int a; // non static                           // 2 declarations 
	static int b; // static 
	
	static void m1()  // this is Static method
	{
		System.out.println(" this is m1 - static method");
		
	}
	
	void m2()  // non static 
	{
		System.out.println(" this is m1 -  non static method");
	}
	
	
	void m3 () // non static  method 
	{
		a= 200;  // non static variable             // local variable bz inside method 
		b= 300;  // static variable 
		
		m1();  // this is static method 
		m2();	// this is non static method 
	}
	
	
		public static void main(String[] args) {   // asosiy usul 
			
			 b=300;                                // this is static no need object, comes directly 
			 System.out.println(b);
		     m1();
			
		     
		  //   a=200;  this variable is non static can not accessible   
		  //    m2(); this method is non static  can not accessible 
			
			TestStatic ts= new TestStatic();      // this is non static and needs object 
			ts.a=200;
			System.out.println(ts.a);
			ts.m2();  			
	}
	}

	

