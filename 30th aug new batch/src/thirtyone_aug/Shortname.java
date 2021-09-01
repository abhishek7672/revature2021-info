package thirtyone_aug;
import java.util.Scanner;

public class Shortname {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String shortName=sc.nextLine();
		if(shortName.matches("[a-z]{2,6}")) {
			System.out.println("name is valid");
			
		}
		else {
			System.out.println("name is invalid");
		}
		sc.close();
	}


}
