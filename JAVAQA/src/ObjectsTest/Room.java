package ObjectsTest;

public class Room {

	
	int id;
	String name;
	int age;
	String country;
	
	static char grade= 'A';
	
	void roominfo() 
	{
		System.out.println(grade);
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);	
	}
	
	
	public static void main(String[] args) {
		
		Room boy = new Room();
		boy.id =001;
		boy.name = "Nodir";
		boy.age= 15;
		boy.country = "Uzbekistan";
		boy.roominfo();
		
		Room girl = new Room();
		girl.id =002;
		girl.name= "Sofia";
		girl.age= 15;
		girl.country = "USA";
		girl.roominfo();
		

	}

}
