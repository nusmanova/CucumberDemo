package OOPs;

public class DataHiding1 {
	
private	double balance;
private	  int id;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public static void main(String[] args) {
		
		DataHiding1 dh1= new DataHiding1();
		
		dh1.setBalance(2.500);
		dh1.setId(001);
		
		System.out.println(dh1.getBalance());
		System.out.println(dh1.getId());
		
		
	}

}
