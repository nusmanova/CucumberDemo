package CoreJava;

public class Test2Static {

	int r;           // non static  , instance variable 
	static int m;  // static variable
	
	
	void u1()  // bu non static usul 
	{
		System.out.println("Bu usul non static usuldir :" + r);
	}
	
	
	static void u2()  // static usul
	{
		System.out.println("Bu usul non static usuldir :" + m);
	}
	
	void u3() // non static usul
	{
		System.out.println("Bu usul non static usuldir :" + r);  // uzgaruvchan non static
		System.out.println("Bu usul non static usuldir :" + m);  // uzgaruvhacn static 
		
	u1();                                                          // non static usul
	u2();                                                          // static usul
		
	}
	
	
	public static void main(String[] args) {
		
		Test2Static ts2 = new Test2Static();    // bu obekt 
		ts2.r= 20;                             // obekt orqali uzgaruvchanga qiymat berdik, chunki bu non static uzgaruvchan
		ts2.u1();                             // obekt orqali usulni (method) chaqurduk, chunki bu non static   usul
		
        
         m=10;                // bu static  Uzgaruchan  (variable )   obekt kerak EMAS
         u2();               // bu static usul (method)    obekt kerak EMAS 
      	
	}
}
