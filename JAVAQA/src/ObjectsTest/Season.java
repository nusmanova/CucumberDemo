package ObjectsTest;

public class Season {

	
static String winter = "Snow Time";
 String months;
 int days;



	void display() 
	{
		System.out.println(winter);
		System.out.println(months);
		System.out.println(days);
		
	}
	

	public static void main(String[] args) {
		Season december = new Season();
		december.months = "First month";
		december.days = 31;
		december.display();
		
		Season january = new Season();
		january.months = "Second month";
		january.days= 31;
		january.display();
	
	}

}
