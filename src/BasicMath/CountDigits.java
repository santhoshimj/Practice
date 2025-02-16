package BasicMath;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		//using the string method to count the number of digits in the number
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		String number = scan.next();
		
		//int count = number.length();
		
		System.out.println("the number of digits in the number is : " + number.length());
		
		
	}

}
