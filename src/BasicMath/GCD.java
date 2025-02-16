package BasicMath;
import java.util.*;
public class GCD {
	
	int g;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" :: Program to find the gcd of 2 numbers :: ");
		
		System.out.print("Enter the first number : ");
		int a = scan.nextInt();
		System.out.print("Enter the second number : ");
		int b = scan.nextInt();
		
		GCD gg = new GCD();
		int res=gg.EuclidMethod(50, 60);
		System.out.println("the gcd is : " + res);
		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gg.g = i;
			}
		}
		System.out.println("The GCD of 2 numbers by normal method  is : " + gg.g);
	}
	
	
	public  static int EuclidMethod(int a, int b)
	{
		 while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
		
		
	}

}
