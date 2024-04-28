package Abstractions;


interface Printertest
{
	int a=10 ; // by default variable is static or final 
	void outlet(); // abstract method
	void wifi();
	void mobile();
	
}


class testhp implements  Printertest 
{

	@Override
	public void outlet() {
		System.out.println("Check printer outlet on off");
		System.out.println(a);
	}

	@Override
	public void wifi() {
		System.out.println(" COnnect printer to home wifi");
		
		
	}

	@Override
	public void mobile() {
		System.out.println("print from mobile wifi");
		
	}
	
}

public class FaridaInterface {

	public static void main(String[] args) {
		
		//Printertest pt= new Printertest(); // not valid 
		
		Printertest pt = new testhp(); // valid 
		
         pt.outlet();
         pt.wifi();
         pt.mobile();
     
     
		
		
		
	
	}

}
