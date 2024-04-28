package ArraysDemo;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		
		int a[][]= new int [3][2]; // declaration  3 bu qator and 2 bu ustun

		
		// storing elements value into array 
		
		
		a[0][0]= 10;  // birinchi qator 0 qatorning index va ustonining 0 index 
		a[0][1]=20; 
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		int c [][]= {{10,20}, {30,40},  {50,60}};
		
		System.out.println(a.length);
		
		System.out.println(c [1][0]);
		

	}

}
