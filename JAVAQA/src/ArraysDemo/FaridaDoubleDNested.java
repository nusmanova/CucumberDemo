package ArraysDemo;

public class FaridaDoubleDNested {

	public static void main(String[] args) {
		
		
		int a [][]= new int [3][2];
		
		
		a[0][0]= 3;
		a[0][1]= 4;
		
		a[1][0]= 5;
		a[1][1]= 6;
		
		a[2][0]= 7;
		a[2][1]= 8;
		
		
		//System.out.println(a.length);
		
		/*for (int x=0; x<=2; x++)
		{
			for (int v =0; v <=1; v++)
			{
				System.out.println(a [x][v]);
			}
		}*/
		
		for (int[] x:a) 
		{
			System.out.println(x[0]);
			System.out.println(x[1]);
		}
		
	}

}
