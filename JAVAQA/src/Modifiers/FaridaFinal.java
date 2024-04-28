package Modifiers;

public class FaridaFinal {


	
		final int x=10;
		final int y=12;
		
		//x=15; Variable Value can not be changed
		
		final void method1()
		{
		System.out.println("This is non access final Modifiers");
		}
		
		
		
		public static void main(String[] args) {
		
         //void method1() Method can not be override
        // {
        //	 System.out.println("m1 method is overriden");
        // }
	}

}
