package Encapsulation;

public class typecasting {

	public static void main(String[] args) {
		
		int myint =  9; // initialization 
		double mydouble = myint; // declare value of int to double  // automatic casting 
		
		
		
		double minedouble = 9.5;
		
		int mineint =  (int) minedouble ; // manual casting 
		
		
		 System.out.println(myint);  // 9 
		 System.out.println(mydouble); //  9.0
		 
		 
		 
		 
		 System.out.println(minedouble);  // 9.5
		 System.out.println(mineint); //  9
		
		

	}

}
