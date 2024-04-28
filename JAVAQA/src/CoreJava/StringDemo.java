package CoreJava;

public class StringDemo {

	public static void main(String[] args) {
		
		String s = "Hello";
		String m= "World";
		String p= s+ m;  // Hello World 
		
		
		
		
		
		
		
		
		
		String n= new String ("ABC");
		
		n= "immutable";   // new value
		
		String n2= new String ("DFG");
		
		System.out.println(n.concat(n2));
		
		
		
		StringBuilder nm = new StringBuilder ("somevalue");
		StringBuilder nm1 = new StringBuilder ("  any value");
		
		System.out.println(nm.append(nm1));
		
		
		
		/*String s1= 25 + "Java";
		String s2= m+ 5;
		String s3= 30+50 +"age";        //80 Age      So number will run as arithmetic operation and then string 
		String s4 = 5+3 +"Child"+3+3;    //8 Childe 6    which numbers came after string it does not do any arithmetic operation 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);*/
		
		
		

	}

}
