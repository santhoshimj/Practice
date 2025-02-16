package BasicMath;

import java.util.Scanner;

public class Palindrome {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string/number : ");
		String num1 = scan.next();
		
		int n= num1.length();
		
		String num2 = "";
		for(int i=n-1;i>=0;i--)
		{
			num2 +=num1.charAt(i);
		}
		
		//check for palindrome
		
		if(num1.equals(num2))
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("its not a palindrome");
		}
	}

}
