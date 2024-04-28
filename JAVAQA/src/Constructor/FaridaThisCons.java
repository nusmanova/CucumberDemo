package Constructor;

public class FaridaThisCons {

	int age= 0;
	
	int year=0;
	
	String name= "Null";
	
	
	
	FaridaThisCons (int age, int year, String name)
	{
		this.age=age;
		this.year=year;
		this.name=name;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		FaridaThisCons ftc = new FaridaThisCons (25,1998, "Farida");
		System.out.println(ftc.name +  " " + ftc.age);

	}

}
