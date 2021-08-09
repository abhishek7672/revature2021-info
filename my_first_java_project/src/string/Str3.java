package string;

public class Str3 {
	public static String domain(String s) {
		int x =s.indexOf("/");
		s=s.substring(0,x);
	
		
	
		if (s.startsWith("https")) {
		s=s.substring(8);
		}
		else {
		s.substring(7);
			
		}
		return s;
		
	}
	public static void main(String[]args) {
		System.out.println(domain("https://wikipedia.org/wiki/main_page"));
		
		
	}
}
	
	
