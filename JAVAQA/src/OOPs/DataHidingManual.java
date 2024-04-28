package OOPs;

 class Data {

	
	private int id;
	
	public int setID(int eid)
	{
		return id=eid;
	}
	
	public int  getID ()
	{
		return id;
	}
 }
	
 
	public class DataHidingManual {
	
	public static void main(String[] args) {
	
		Data hdo =  new Data();
		hdo.setID(25);
		
		System.out.print(hdo.setID(25));
		
	}

}
