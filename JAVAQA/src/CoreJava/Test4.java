package CoreJava;

public class Test4 {

	static int x = 10;
	       int y = 20;
	
	
	
	public static void main(String[] args) {
		Test4 t1= new Test4();
		t1.y=222;
		
		x=110;
		
		System.out.println(t1.y);
	
		System.out.println(x);
		
	}

}
