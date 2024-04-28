package Loop;

public class ContinueForLoop {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++ )  // increment 
		
		{
			if(i==7)
			{
				continue;
			}
		
	      	System.out.println(i);
        }

		
		for (int b= 10; b>=1; b--)  // decrement 
		{
		if (b==6)
		    {
			continue;
			}
		System.out.println(b);
		}
	}

}
