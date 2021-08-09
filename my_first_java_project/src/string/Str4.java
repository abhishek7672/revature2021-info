package string;

public class Str4  {
	public static void 	secure(String str){
		if(str.startsWith("https")){
			System.out.println("secure");
			
		}else {
			System.out.println("not secure");
		}
	
		
		
	}
	public static void main(String[] args) {
		secure("https/wikipedia.org");
		secure("https/wekipedia.org");
	}
}


