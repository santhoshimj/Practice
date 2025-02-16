package BasicMath;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		
		String number = scan.next();
		int n = number.length();
		
		String reversed = "";
		for(int i=n-1;i>=0;i--)
		{
			reversed += number.charAt(i);
		}
		
		System.out.println("the reversed number is : " + reversed);

	}

}
