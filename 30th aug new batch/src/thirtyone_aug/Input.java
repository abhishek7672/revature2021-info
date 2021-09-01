package thirtyone_aug;
import java.util.Scanner;

public class Input {
	public static void main(String[] ags) {
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter celcius temp");
	int celcius =sc.nextInt();
	System.out.println("now we will get fahrenheit temp");
	float fahrenheit=(celcius*9/5f)+32;
	System.out.println(fahrenheit) ;
	
	
}
}
