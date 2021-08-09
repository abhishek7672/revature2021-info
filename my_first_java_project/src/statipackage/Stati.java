package statipackage;

public class Stati {
	private int a;
	private int b;
	private static int d = 100 ;

	public Stati(){
		System.out.println("coonstructor");
	}
	public static void iamstatic() {
 System.out.println("iamstsic");
		
	}
	public void iamnotstaic(){
		System.out.println("iamnotstatic");
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("d"+d);
	}
 
	static{
		System.out.println("iwillcall ist");
	}
		{
			System.out.println("i willcall before constructor");
		}



public static void main(String[] args) {
	System.out.println("hello");
	iamstatic();
	Stati d1 =new Stati();
	Stati d2 =new Stati();
	d1.iamnotstaic();
	d2.iamnotstaic();
	Stati2 s1 =new Stati2();
	s1.net();
	
	
	
	 
	
}
}
	

	
	

