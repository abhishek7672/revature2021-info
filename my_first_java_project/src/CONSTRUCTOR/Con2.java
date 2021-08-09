package CONSTRUCTOR;

public class Con2 {
	private int x;
	private int y ;
	public Con2(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int add() {
		return x+y;
	}
	public Con2(int z) {
		System.out.println(z);
	}
}
	
