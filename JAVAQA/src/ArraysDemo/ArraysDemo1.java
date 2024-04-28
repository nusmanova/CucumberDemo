package ArraysDemo;

public class ArraysDemo1 {

	public static void main(String[] args) {
		
		int a[]= new int[5]; // declaration of arrays with 5 elements ;  BU birinchi usul
		
		a[0]= 100;//1
		a[1]=200; //2
		a[2]=300; //3
		a[3]=400; //4
		a[4]=500; //5
	
		System.out.println(a[2]);
		System.out.println(a.length);
		
		
		int b []= {110, 220, 330, 440};    //declaration of arrays with 4 elements ; BU IKKINCHI USUL
		
		System.out.println(b[1]);
		System.out.println(b.length);
		
		
		for (int i=0; i<=3; i++)
		{
			System.out.println(b[i]);
		}
		
		
		//System.out.println(a);
		//System.out.println(b);
		
	}
}