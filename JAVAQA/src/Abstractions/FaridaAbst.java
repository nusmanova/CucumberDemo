package Abstractions;

public abstract class FaridaAbst {

	
	public abstract void babydoll(); // abstract method
	public abstract void makeup();  // abstract method
	
	
	
	public void dolltype() { // default method 
	
	System.out.println("Babydoll is girl");
	
}
	
}


class Nasiba extends FaridaAbst{

	@Override
	public void babydoll() {
		
		System.out.println("Babydoll is musical");
		
	}

	@Override
	public void makeup() {
		System.out.println("Babydoll has long hair and eyelashes");
		
	}
	
	
	
	
}