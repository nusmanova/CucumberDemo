package ArraysDemo;

public class FMultiDimenArray {

	public static void main(String[] args) {
		
		
		int b [][][]= new int [2][2][2];
		
		b [0][0][0]=2;
		b [0][0][1]=4;
		b [0][1][0]=6;
		b [0][1][1]=8;
		
		b [1][0][0]=10;
		b [1][0][1]=12;
		b [1][1][0]=14;
		b [1][1][1]=16;
		
		
		System.out.println(b [0][0][0]);
		System.out.println(b [0][1][1]);
		System.out.println(b.length);
		
		
		int m [][][]=
			{	
					{{2,4},  {6,8}}	,
					
					{{10,12}, {14,16}}	
			};
	}

}
