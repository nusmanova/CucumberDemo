package Abstractions;

public class Demo {
	
	public static void main (String [] args) {
		
		RozaPhone zp= new RozaPhone();
		zp.apps();
		zp.call();
		zp.sms();
		zp.photo();
		
		
	}
}

abstract class NasibaPhone{   // abstract class
	
	public void call() // non abstract method
	{
		
		System.out.println("Calling Nasiba");
	}
	
	public abstract void sms();
	public abstract void photo();
	public abstract void apps();
	
}


 class RozaPhone extends NasibaPhone{  //concrete 
	
	public void sms() 
	{
		System.out.println("SMS messages");
	}
	
	
	public void photo() 
	{
		System.out.println("Photo albums");
	}
	
	public void apps() 
	{
		System.out.println("Telegram apps");
	}
	
}