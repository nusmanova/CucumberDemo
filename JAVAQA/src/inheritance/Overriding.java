package inheritance;


	class Bank
	{
		int feerate() {
			return 0;
		}
	}
	
	
	class PCN extends Bank {
		
		int feerate(){		
		return 10;
		}
	}
	
	
	class American extends Bank{
		int feerate(){		
			return 15;
			}
	}
	
	class Citizen extends Bank{
		int feerate(){		
			return 12;
			}
	}
	
	
	
	public class Overriding {
	
	public static void main(String[] args) {
	
		PCN pobj = new PCN();
		System.out.println(pobj.feerate()); //10
		
		American aobj= new American();
		System.out.println(aobj.feerate()); //15
		
		Citizen cobj= new Citizen ();
		System.out.println(cobj.feerate()); //12
		
	}

}
