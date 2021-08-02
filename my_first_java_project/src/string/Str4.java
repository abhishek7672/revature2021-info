package string;

public class Str4  {
	static String secure(String s1)
	{
		if(s1.startsWith("https://"))
			{return "secure";}
		else
		if(s1.startsWith("http://"))
		{return "not secure";}
		
		return "not secure";
		
	}
	public static void main(String[] args) 
	{
		System.out.println(secure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(secure("http://en.wikipedia.org/wiki/Main_Page"));
		
		
	}
}


