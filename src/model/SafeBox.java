package model;

public class SafeBox {

	public static double password = 000000; 
	public static String safe = "";
	
	public static boolean unlocker(double p) {
		boolean sentinel = false;
		
		if(p == password) {
			sentinel = true;
		}
		
		return sentinel;
		
	}
	
	
	
	public String getSafe() {
		return safe;
	}

	public void setSafe(String safe) {
		SafeBox.safe = safe;
	}
	
	
}
