package Abstractions;


abstract class fruits{
	
	public abstract void sweet();
	public abstract void sour();
	public abstract void tropic();
	
	 
	
	public void homegrown()
	{
		System.out.println("Apple is home garden fruit");		
	}
}



class vegitable extends fruits{

	@Override
	public void sweet() {
	
		System.out.println("Grape is sweet");	
	}

	@Override
	public void sour() {
		System.out.println("Lemon is sour fruit");	
		
	}

	@Override
	public void tropic() {
		
		System.out.println("Kiwi is tripical fruit");
	}
	
}



public class AbstractTest {

	public static void main(String[] args) {
		vegitable vt = new vegitable ();
		
		vt.homegrown(); // method
		vt.sour();
		vt.sweet();
		vt.tropic();
		
		
		
	}

}


 