package ArraysDemo;

public class ThreeDimenArray {

	public static void main(String[] args) {
		// 3x3x3
		
		
	int x [][][]= new int [2][2][2];
		
	x[0][0][0] = 1;
	x[0][0][1] = 2;
	x[0][1][0] = 5;
	x[0][1][1] = 6;
	
	x[1][0][0] = 13;
	x[1][0][1] = 14;
	x[1][1][0] = 17;
	x[1][1][1] = 18;
	
	
	System.out.println(x [1][0][1]);
	
	
	
	 int p [][][]= 

		 {
			{ {1,2},    {5,6} },
				
			{ {13,14},   {17,18} },
		 };

	
	 System.out.println(p [1][1][1]);
	 
	 System.out.println(x.length);
	 System.out.println(p.length);
	 
	}

}
