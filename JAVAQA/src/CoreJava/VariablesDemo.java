package CoreJava;

public class VariablesDemo { // sinf

	
	
	int num = 25; // global variable bu global uzgaruvchan

	static String name = "Farida";
	
	 String name2 ="Nasiba";  // instance variable object
	
	
	
	
	
	
	
	public static void main(String[] args) { // asosoiy usul
		
	int number=10;	 //local variable + mahalliy uzgaruvchan
		
	
	VariablesDemo vd= new VariablesDemo(); // this is object created
	
	// obekt qulish sinf nomi + uzgaruchan = new sing nomi ();
	
	
	System.out.println(vd.name2);
	
	
	
	
	System.out.println(number); // bu mahalliy uzgaruchan edi
	System.out.println(name); // bu global ammoy static orqali tushurdik
	
	

	}

}
