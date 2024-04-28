package Constructor;

class A
{
	
	public A()
	{
	System.out.println("Bu A");
    }
	
	public A(int i)
	{
		System.out.println("Bu A int");
	}
}




class B extends A{
	public B()
	{
		super();
	System.out.println("Bu B");
	}
	
	
	public B(int i)
	{
		super(i);
		System.out.println("Bu B int");
	}
}


public class ConsSuper {

	public static void main(String[] args) {
		B obj= new B(5);
		

	}

}
