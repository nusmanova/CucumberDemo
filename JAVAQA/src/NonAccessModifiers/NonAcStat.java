package NonAccessModifiers;

public class NonAcStat {

	public static void main(String[] args) {
		
		 // Static method : class itself
		
		     sayHi();
		
		
		// Non static Method: instance of class
		     
		NonAcStat ns = new NonAcStat();
		ns.sayHello();
		

	}
	
	 static void sayHi() // static usul
	 {
		 System.out.println("Hi!");
	 }

	 
	 void sayHello() // non static 
	 {
		 System.out.println("Hello!");
	 }
}
