package Constructor;

class test1{ // Parent class or Super class
		
	// Default
     public 	test1 ()
	{
	System.out.println("Bu default test1 ");
	}
	
	// Invoke Parametrized constructor 
    public 	test1 (String nasiba)
{
System.out.println("this is parimetrized cons test1 ");
}	
}


class test2 extends test1 {  // inheretance called super class
 public test2() // default const
 { 
System.out.println("Bu default test2 ");	
}

 public test2 (String nasiba)
 
 {
	 super(nasiba);
	 System.out.println("this is parimetrized cons test2 ");
 }
}

public class TestConst {

	public static void main(String[] args) {
	
		test2 t2= new test2("Name of person");
		System.out.println(t2);	
		}
}
