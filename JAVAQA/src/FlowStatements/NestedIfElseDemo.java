package FlowStatements;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		
		int day=7;
		
		
		if (day==1)
		{
			System.out.println("Sunday");
		}
		
		else if (day==2)
		{
			System.out.println("monday");
		}
		
		else if (day==3)
		{
			System.out.println("tuesday");
		}
		
		else if (day==4)
		{
			System.out.println("wednesday");
		}
		
		else if (day==5)
		{
			System.out.println("thursday");
		}
		
		else if (day==6)
		{
			System.out.println("friday");
		}
		
		else  // default 
		{
			System.out.println("saturday");
		}
	}

}
