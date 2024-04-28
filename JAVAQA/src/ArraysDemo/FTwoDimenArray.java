package ArraysDemo;

public class FTwoDimenArray {

	public static void main(String[] args) {
	
		
		int r [][]= new int [4][3];
		
		
		r [0][0]=5;
		r [0][1]=1;
		r [0][2]=12;
		
		r [1][0]=7;
		r [1][1]=3;
		r [1][2]=4;
		
		r [2][0]=9;
		r [2][1]=2;
		r [2][2]=6;
		
		
		r [3][0]=11;
		r [3][1]=10;
		r [3][2]=8;
		
		
		int p [][]= {{ 5,1,12},  {7,3,4},  {9,2,6}, {11,10,8}};

		
		System.out.println(r.length); //4
		
		
		for (int m=0; m<=3; m++) // this is row
		{
			for (int z=0; z<=2; z++)
			{
				 System.out.println(r[m][z]);
			}
		}
		
		

	}

}
