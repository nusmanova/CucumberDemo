package OOPs;

public class DataHiding {

double balance;
  int id;
	 
	void bank()
	{
		System.out.println(balance);
		System.out.println(id);
		
	}
	 
	public static void main(String[] args) {
		
		DataHiding dh= new DataHiding ();
		dh.id= 001;
		dh.balance= 2.300;
		dh.bank();
				
		

	}

}
