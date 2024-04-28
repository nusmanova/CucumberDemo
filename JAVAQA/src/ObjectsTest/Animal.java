package ObjectsTest;

public class Animal {

	String name;  // declaration 
	String color;
	int age;
	double weight;
	
	
	String food; 
	String drink;
	
	static String zoo = "Chicago zoo"; //initialization 
	
	
	void animalinfo()  // bu biz uzimiz yozgan oddiy usul, 
	
	{
		System.out.println(zoo);
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(weight);
	}
	
	
	
	void animaleat() // this is default method / oddiy biz yozgan usul
	{
		System.out.println(food);
		System.out.println(drink);
		
	}
	
	 static void animalgroup()
	 {
		 System.out.println("Animal can be home cared");
	 }
	
	 public static void main(String[] args) {
			
			
			
			
			Animal rabbit = new Animal(); 
			rabbit.name = " Sunny Rabbit";  // variable 
			rabbit.color = "White";
			rabbit.age = 3;
			rabbit.weight = 2.5;
			rabbit.animalinfo(); // biz usulni chaqirdik 
			rabbit.food = "Carrot";
			rabbit.drink= "Water";
			rabbit.animaleat();
			
			
			
			Animal cat = new Animal();
			cat.name = "Kesha cat";
			cat.color = "Black"		;
			cat.age = 7;
			cat.weight= 4.5;
			cat.animalinfo();
			cat.food ="Fish";
			cat.drink = "Milk";
			
			
			
			Animal dog = new Animal();
			dog.name = "Bobby Dog";
			dog.color = "Yellow";
			dog.age = 5;
			dog.weight= 8.3;
			dog.animalinfo();
			dog.food = "Bones";
			dog.drink ="water";
			dog.animaleat();
			

			
		
	}
}

