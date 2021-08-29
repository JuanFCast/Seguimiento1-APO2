package model;

public class SafeBox {

	public static double password = 000000; 
	public static String save = "";
	
	public static boolean unlocker(double p) {
		boolean sentinel = false;
		
		if(p == password) {
			sentinel = true;
		}
		return sentinel;
	}
	
	
	public String getSave() {
		return save;
	}

	public void setSave(String save) {
		SafeBox.save = save;
	}
	

	public static void setPassword(double password) {
		SafeBox.password = password;
	}
	
	
}
