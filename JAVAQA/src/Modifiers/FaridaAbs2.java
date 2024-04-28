package Modifiers;

public class FaridaAbs2 extends FaridaAbst {

	
	
	
	
	public static void main(String[] args) {
		
		FaridaAbs2 fa2=new FaridaAbs2();
		
		fa2.test3();
		fa2.test4();
		
	}
	


	@Override
	public void test3() {
		
		System.out.println("Non abstract method3 here");
	}
}
