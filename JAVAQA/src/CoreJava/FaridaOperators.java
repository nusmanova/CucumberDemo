package CoreJava;

public class FaridaOperators {

	public static void main(String[] args) {
	
		byte x= 15;
		byte y= 25;
		int z= x+y;  //X and Y were operands and we used + as operator
		
		System.out.println(z);
		
	///// +  - * /  % are Arithmetic Operators///
		
		
		System.out.println(x+y); //40
		System.out.println(y-x); //10
		System.out.println(x*y); //375
		System.out.println(y%x); //10
		System.out.println(y/x);// 1
		
	
		
		
		/// <, >, <=, >=,  == , != Relational Operators //////
		
		
		System.out.println(x<y); //True
		System.out.println(x>y);// False
		System.out.println(x<=y);// True
		System.out.println(x>=y); // False
		System.out.println(x==y); // False
		System.out.println(x!=y); // True 
		
		////  Logical Operators &&, || , !, )
		
		boolean t= true;
		boolean p= false;
		
		
		System.out.println(t && p); // False
		System.out.println(t|| p); // True
		System.out.println(!t); //  False 
		System.out.println(!p); // True
		
		
	/////// Increment operator  ++ and Decrement operator --
		
		
		int f= 15;
		//f= f+1; 
		f++; // 16  increment 
		f--; // 15  decrement 
		
		System.out.println(f); 
		
		
//////////Assignment operator  -=, +=, *=, /=,  //////////////
		int n= 200;
		  
		n+=35; // n soniga 35 ni qushdik // 235
		
		n-=25; //210 n soanidan 25 ni ayrdik 
		
		n*=2; // 420 n sonini 2 ga ko'paytirdik
		
		n/=3; // 140  n sinini 3 ga buldik 
		
		
		System.out.println(n); 
		
		
		
		
		System.out.println('a'== 97); // lower a is 97
		System.out.println('A'== 97); // A is 65
		
		String a = "codekaplan";
		String b = "codekaplan123";
		System.out.println(a.length()); //10
		System.out.println(b.length()); //13
		
		System.out.println(a.length() < b.length());	
		
		
	}

}
