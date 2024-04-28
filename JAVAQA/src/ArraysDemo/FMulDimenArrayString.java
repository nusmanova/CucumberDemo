package ArraysDemo;

public class FMulDimenArrayString {

	public static void main(String[] args) {
		
		String f [][][]= new String [3][3][2];
		
		
		f[0][0][0]="apple";
		f[0][0][1]="kiwi";
		f[0][1][0]="pear";
		f[0][1][1]="banana";
		f[0][2][0]="lemon";
		f[0][2][1]="lime";
		
		f[1][0][0]="pineapple";
		f[1][0][1]="melon";
		f[1][1][0]="watermelon";
		f[1][1][1]="srawberry";
		f[1][2][0]="rasberry";
		f[1][2][1]="blueberry";
		
		f[2][0][0]="grape";
		f[2][0][1]="quince";
		f[2][1][0]="dragon";
		f[2][1][1]="peach";
		f[2][2][0]="berry";
		f[2][2][1]="orange";
		
		
		System.out.println(f [1][2][1]);
		System.out.println(f [2][2][1]);
		System.out.println(f.length);
		
		
		String p [][][]=
			{
					
				{{"apple","kiwi"}, {"pear","banana"},{"lemon", "lime"}}, // 1 chi qator (0 index) , 1,2,3 ustun(0,1,2 index ustun) va 1 & 2 qimaymatlari
					
				{{"pineapple", "melon"}, {"waterlemon", "srawberry"},{"rasberry", "blueberry"}},// 2 chi qator (1 index) , 1,2,3 ustun(0,1,2 index ustun) va 1 & 2 qimaymatlari
					
				{{"grape", "quince"}, {"dragon", "peach"},{"berry", "orange"}},//// 3 chi qator (2 index) , 1,2,3 ustun(0,1,2 index ustun) va 1 & 2 qimaymatlari
			};

	}

}
