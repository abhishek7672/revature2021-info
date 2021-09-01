package thirtyone_aug;
import java.util.Scanner;

public class Minutes {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter time");
		String time=sc.nextLine();
		if(time.matches("[0-9]{2}[:]{1}[0-9]{2}[:]{1}[0-9]{2}")) {
			System.out.println("name is valid");
			System.out.println(time.substring(3,5));
		}
		else
		{
			System.out.println("name is invalid");
		}
		
		sc.close();
		
	}

}
