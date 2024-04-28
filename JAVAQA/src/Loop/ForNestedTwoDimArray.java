package Loop;

public class ForNestedTwoDimArray {

	public static void main(String[] args) {
		
		int d[][]=new int [3][2];
		
		d [0][0]=5;
		d [0][1]=10;
		
		d [1][0]=15;
		d [1][1]=20;
		
		d [2][0]=25;
		d [2][1]=30;
		
		
		for (int p =0; p<=2; p++) // bu qatorniki
		{
          for (int j=0; j<=1; j++) 
          {
        	  System.out.println(d [p][j]); 
          }
	
		 }

}
}
