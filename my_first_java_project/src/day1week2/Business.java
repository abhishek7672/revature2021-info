package exptionalhandling;

public class Business {
	public boolean isvalid(String s) throws cheked {
		if(s.matches("[1-9]{12}")) {
			return true;
		}
		else {
			throw new cheked("is not valid");
		}
		
	}

}
