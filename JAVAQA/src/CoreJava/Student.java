package CoreJava;

public class Student {
	
	int sid;           //declaration 
	String sname;
	char sgrade;
	

	
	Student (int id, String name, char grade) //3 method Constructor
	{

		sid=id;
		sname=name;
		sgrade=grade;
		
	}
	
	
	
	void getvalue (int id, String name, char grade) //2 method with paramentr 
	{
		sid=id;
		sname=name;
		sgrade=grade;	
	}
	
	
	
	void stuinfo()  //  1 method using reference variable 
	
	{
		System.out.println(sid+"   "+sname+"   "+sgrade);
		
		/*System.out.println(sid);
		System.out.println(sname);
		System.out.println(sgrade);*/
	}
	
	
	
	
	
}
