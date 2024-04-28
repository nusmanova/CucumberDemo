package Abstractions;

public class Demo2 {

	public static void main(String[] args) {
		B obj =new B();
		obj.dance();
		obj.sing();
		
		
	}

}


interface A
{
	
	int year= 80;            //final and static 
	String album= "Abba";
	
	void dance();
	void sing();
}


class B implements A

{

	@Override
	public void dance() {
		System.out.println(" Ballet dance");
		
	}

	@Override
	public void sing() {
		System.out.println(" Opera music");
		
	}
	
}