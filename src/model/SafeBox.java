package model;

public class SafeBox {

	public static double password = 000000; 
	
	public static boolean unlocker(double p) {
		boolean sentinel = false;
		
		if(p == password) {
			sentinel = true;
		}
		
		return sentinel;
		
		
	}
	
	
}
