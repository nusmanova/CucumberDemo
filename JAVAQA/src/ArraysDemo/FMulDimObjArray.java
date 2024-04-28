package ArraysDemo;

public class FMulDimObjArray {

	public static void main(String[] args) {
		
		Object k [][][]= new Object [2][2][2];
		
		k [0][0][0]= 'F' ;
		k [0][0][1]= "Toshpulatova" ;
		k [0][1][0]=  25;
		k [0][1][1]= 5.4 ;
		
		k [1][0][0]='N';
		k [1][0][1]="Usmanova";
		k [1][1][0]=36;
		k [1][1][1]=5.3;
		
		
		
		
		Object j [][][]=
			{
		
			{{'F', "Toshpulatova"},{25, 5.4}},//1 qator, 1-2 uston va 1-2 qiymatlar
			{{'N', "Usmanova"},{36,5.3}}// 2 qator, 1-2 uston va 1-2 qiymatlar
		
	        };

}
}
