package NonAccessModifiers;


 class Test
{
	
	final int a =10; // variable used final keyword
	
	final void m1() // method used final keyword
	{
		//a=20; // not valid bz it is final variable 
		System.out.println(a);
	}
}


class Test2 extends Test
{
	// void m1() // not valid bz m1 method is final 
	// {
	//	 System.out.println("m1 method is overriden");
	// }
}



public class FinalExample {

	public static void main(String[] args) {
		
	}

}
