package Modifiers;


class A
{
	private int p=10; // uzgarvchan
	
	private void m1()  //usul 
	{
		System.out.println(p);
	}
}





public class ModifierPrivate {

	public static void main(String[] args) {
		
		A obj= new A ();
		//A.p=20; // cannot access since it is private 
	//	A.m1(); // cannot access since it is private 

	}

}
