package exptionalhandling;

public class Business1 {
	public boolean isvalid1(String s) {
		if(s.matches("[1-9]{9}[-]{1}[1-9]{3}")) {
			return true;
		}else {
			throw new Isvalid();
		}
		
	}

}

