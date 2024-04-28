package Loop;

public class ForNestedTwoDimArray2 {

	public static void main(String[] args) {
	
		
  int m [][]= new int [4][2];
  
    m [0][0]=5;
	m [0][1]=10;
	
	m [1][0]=15;
	m [1][1]=20;
	
	m [2][0]=25;
	m [2][1]=30;
	
	m [3][0]=35;
	m [3][1]=40;
	
	
	for (int p =0; p<=3; p++) // bu qatorniki
	{
      for (int j=0; j<=1; j++)  // bu ustun
      {
    	  System.out.println(m [p][j]); 
      }

	 }

	}

}
