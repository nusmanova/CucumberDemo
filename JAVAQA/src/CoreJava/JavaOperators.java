package CoreJava;

public class JavaOperators {

	public static void main(String[] args) {
		

		int a= 10; 
		int b=20;
		int c= a+b;  //a and b are OPERANDS   and + is operator 
		
		//a,b,c  are variables; 10.20 are values
		
		
	//////////////// Arithmetic Operators + , - ,* ,/ %/////////////////
		
		System.out.println(a+b); //30
		System.out.println(b-a); //10
		System.out.println(a*b); //200
		System.out.println(a/b); //0
		System.out.println(a%b); //10
		
	
		///////////////////Relational Operators  <,  > , <=, >=, != , ==  ///////////////   Boolean 
		
		
		
		System.out.println(a<b); //True     // a less b
		System.out.println(a>b); //False    // a greater than 
		System.out.println(a<=b); //True    // a less than or equal to b
		System.out.println(a>=b); //false   // a greater or equal to b
		System.out.println(a==b); //False   // a is equality operators
		System.out.println(a!=b);// True    // a is for non equality to b
		
		
		//////// Logical Operators  &&(and)   || (or)  ! (not) /////////////// boolean 
		
		boolean x= true;
		boolean y = false;
		
		System.out.println(x && y); //  False  
		System.out.println(x || y); //  True
		System.out.println(!x); //     False
		System.out.println(!y); //    True
  
		
		/////// Increment operator  and Decrement operator ++ and -- ////////////////// int 
		
		int p;
		
		p=a; 
		System.out.println(p);
	
		//p = p+1;
		//p++;    //p = p+1;      // increment operator 
		//System.out.println(p);
		
		 
		 p--;       // p= p-1;  this is decrement operator 
		 System.out.println(p); // 9 
		 
		 
		 ////////// Assignment operator  -=, +=, *=, /=,  //////////////
		  p= 100;
		  
		  p+=25;  // 125    it was 100 and we added 25  
		  p-=25; // 100     last P value was 125 and we minus 25
		  p*=25; // 2500
		  p/=25; //100
		  System.out.println(p);
		  
		  
		    
		
	}

}
