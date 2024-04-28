package String;

public class DemoString {

	public static void main(String[] args) {
		
		
		String s = "Hello";
		
		String m= "World";
		
		String p= s + m;  // Hello World 
		
		String w= 25+15+"Hi"+30+40;
		
		String r = "Buy" +25+15;
		
		String z = 20-5 + "Test";
		
		
		System.out.println(w);
		
		System.out.println(r);
		
		System.out.println(z);
		
		//System.out.println(p);
		
		//System.out.println(s.concat(m));
		
		//System.out.println(s.concat("Java"));
		
		//System.out.println(m.concat(p));
		
		
		

		String n= new String ("ABC");
		
		n= "immutable";   // new value
		
	   
		String n2= new String ("DFG");
		
		System.out.println(n.concat(n2));
		
		
	}

}
