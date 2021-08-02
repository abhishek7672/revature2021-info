package string;

public class Str3 {
	
	static String domain(String str)
	{
		if(str.startsWith("https://"))
			{str=str.substring(8);}
		else
		if(str.startsWith("http://"))
		{str=str.substring(7);}
		
		int x=str.indexOf('/');
		str=str.substring(0,x);
		return str;
	}
	public static void main(String[] args) 
	{
		System.out.println(domain("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(domain("http://en.wikipedia.org/wiki/Main_Page"));
		

}
}
