package CoreJava;

public class EmployeeMain {

	
public static void main(String[] args) {   // asosiy usul
		
		Employee emp1 = new Employee();   // this is object  and we used class name + variable and new Employee
		emp1.eid = 001;                     // referance variable 
		emp1.ename = "Guli";
		emp1.eage = 30;
		emp1.eprof = "Teacher";
		emp1.esal = 45000.00;
		emp1.empinfo();

		
		Employee emp2 = new Employee(); // create new object ( 2 shaxsni yozdik)
		emp2.eid = 002;
		emp2.ename = "Mary";
		emp2.eage = 32;
		emp2.eprof = "Cooker";
		emp2.esal = 38000.23;
		emp2.empinfo();
		
		
		Employee emp3 = new Employee();
		emp3.eid = 003;
		emp3.ename = "Mike";
		emp3.eage = 18;
		emp3.eprof = "Admin";
		emp3.esal = 50000.00;
		emp3.empinfo();
		

	}


}
