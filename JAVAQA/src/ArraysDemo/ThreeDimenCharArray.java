package ArraysDemo;

public class ThreeDimenCharArray {

	public static void main(String[] args) {
		
		char l [][][]= new char [2][3][2];
		
		
		l [0][0][0]= 'R';  //1 qator, 1 uston va 1 qiymati
		l [0][0][1]= 'O';  //1 qator, 1 uston va 2 qiymati
		
		l [0][1][0]= 'Z';   //1 qator, 2 uston va 1 qiymati
		l [0][1][1]= 'A';   //1 qator, 2 uston va 2 qiymati 
		
		l [0][2][0]= 'H';   //1 qator, 3 uston va 2 qiymati 
		l [0][2][1]= 'W';   //1 qator, 3 uston va 2 qiymati 
		
		
		
		
		l [1][0][0]= 'N';   //2 qator, 1 uston va 1 qiymati 
		l [1][0][1]= 'E';   //2qator, 1 uston va 2 qiymati 
		
		l [1][1][0]= 'P';  //2 qator, 2 uston va 1 qiymati 
		l [1][1][1]= 'S';  //2 qator, 2 uston va 2 qiymati 
		
		l [1][2][0]= 'M';  //2 qator, 3 uston va 1 qiymati 
		l [1][2][1]= 'G';  //2 qator, 3 uston va 2 qiymati 
		
		System.out.println(l [1][2][1]);  // 'G'
		System.out.println(l.length);     //2
		
		
		
		char m [][][]= 
			{
					{ {'R', 'O'},   {'Z', 'A'},   {'H', 'W'}},
					
					{ {'N', 'E'},   {'P', 'S'},    {'M', 'G'}},
			};
		
		
	    	System.out.println(m [1][2][1]);  // 'G'
	}

}
