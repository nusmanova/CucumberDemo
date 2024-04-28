package Encapsulation;

public class Dog {

	String color;
     String name;
	String type;
	int age;
	
	 public void barking() 
	 {
		 System.out.println ("Dog barks");
	 }
	
	
	public void eating () 
	{
		System.out.println ("Dog eats");
		
	}
	
	 public void protects() 
	 {
		 System.out.println ("Dog security");
	 }
	
	 
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	
	public static void main(String[] args) {
   Dog jack= new Dog();
  
   jack.setAge(3);
   System.out.println(jack.getAge());
  
   jack.setName("Bobby");
   System.out.println(jack.getName());
   
   jack.setType("Bulldog");
   System.out.println(jack.getType());
   
   
   jack.setColor("Black");
   System.out.println(jack.getColor());
   
   
	}

}
