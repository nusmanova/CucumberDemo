package Loop;

public class ForNestedThreDimArray {

	public static void main(String[] args) {
		
		int x [][][]= new int [2][2][2];
		
		x[0][0][0] = 1;
		x[0][0][1] = 2;
		x[0][1][0] = 5;
		x[0][1][1] = 6;
		
		x[1][0][0] = 13;
		x[1][0][1] = 14;
		x[1][1][0] = 17;
		x[1][1][1] = 18;
		
		
		System.out.println(x.length);
		
		 for (int l=0; l<=1; l++) // qator
		 {
			 for (int n=0; n<=1; n++) // ustun
              {
				 for (int g=0; g<=1; g++)  // qiymat
				 {
					 System.out.println(x [l][n][g]);
				 }
				 
			 }

	      }

}
}
