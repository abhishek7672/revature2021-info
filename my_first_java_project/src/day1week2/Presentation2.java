package exptionalhandling;

public class Presentation2 {
	public static void main(String[]args) {
		Business1 b1=new Business1();
		try {
			if(b1.isvalid1("123456789-123")) {
				System.out.println("is validated");
			}}catch(Isvalid e) {
				System.out.println(e.getMessage());
			}
		
				
		}
		
	}


