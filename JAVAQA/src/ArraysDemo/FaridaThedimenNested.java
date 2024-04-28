package ArraysDemo;

public class FaridaThedimenNested {

	public static void main(String[] args) {
	
int a [][][]= new int [3][2][2];
		
		a[0][0][0]= 3;
		a[0][0][1]= 4;
		a[0][1][0]= 5;
		a[0][1][1]= 6;
		
		a[1][0][0]= 7;
		a[1][0][1]= 8;
		a[1][1][0]= 9;
		a[1][1][1]= 10;
		
		a[2][0][0]= 11;
		a[2][0][1]= 12;
		a[2][1][0]= 13;
		a[2][1][1]= 14;
		
		
		/*System.out.println(a.length);
		
		for (int x=0; x<=2; x++) // row
		{
			for (int v =0; v <=1; v++) // column 
			{
				for (int m =0; m<=1; m++) // value
				{
					System.out.println(a [x][v][m]);
				}*/
		
		for (int[][] b :a)
			
		{
			for (int[] j:b) {
			System.out.println(j[0]);
			System.out.println(j[1]);
			
			}
		}
		

	}

}
