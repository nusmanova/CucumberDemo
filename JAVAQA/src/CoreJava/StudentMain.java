package CoreJava;

public class StudentMain {

	public static void main(String[] args) {
	
		
		
	Student st1 = new Student (1008, "Roza", 'A'); // this is object st1
	
	                                                 // constructor 

	Student st2 = new Student (1050, "Nasiba", 'B');
	
	
	 Student st3 = new Student (1000, "Mike", 'C');
		
		
		/*st1.sid = 1008;  //Reference variable  1 usul
		st1.sname = "Roza";
		st1.sgrade = 'A';*/
		
		
	
		//st1.getvalue(1008, "Roza", 'A');//  method 2 
		  st2.getvalue(1050, "Nasiba", 'B');
		  st3.getvalue(1000, "Mike", 'C');
		
		
		
		st1.stuinfo();
		st2.stuinfo();
		st3.stuinfo();
		
		
	}

}
