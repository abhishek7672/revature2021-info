package exptionalhandling;

public class Presentation {
	public static void main(String[]args) {
		Business b1=new Business();
		try {
			if(b1.isvalid("123456789123s")){
				System.out.println("adhar card is validated");
			}
		}
		catch(cheked e) {
			System.out.println(e.getMessage());
		}
		
	}
	}

				
				
			
			
		
	


