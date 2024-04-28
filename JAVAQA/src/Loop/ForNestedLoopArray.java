package Loop;

public class ForNestedLoopArray {

	public static void main(String[] args) {

		int a[]= new int[5]; // declaration of arrays with 5 elements ;  BU birinchi usul
		
		a[0]= 100;//1
		a[1]=200; //2
		a[2]=300; //3
		a[3]=400; //4
		a[4]=500; //5
	
		//System.out.println(a[2]);//300
		//System.out.println(a.length); //5
		
		
		int b []= {110, 220, 330, 440};    //declaration of arrays with 4 elements ; BU IKKINCHI USUL
		
		//System.out.println(b[1]); //220
		//System.out.println(b.length); //4
		
		
		for (int c=0; c<=b.length; c++) 
		{
			
			System.out.println(c);//0,1,2,3,4
		}
      
		
	}

}
