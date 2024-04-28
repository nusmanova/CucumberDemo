package Constructor;


class F{
	
public int age =25;
	
}



class N extends F{
	
	public int age= 36;
	
	 public void showage() // default method
	
	{
		System.out.println(age); // child class
		System.out.println(super.age);  // parent class
		
	}


}



public class Supertest {

	public static void main(String[] args) {
		
		N n= new N ();
		n.showage();
		

	}

}
