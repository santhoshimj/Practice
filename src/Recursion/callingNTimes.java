package Recursion;
import java.util.*;

public class callingNTimes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of times you want to call the name");
		int n = scan.nextInt();
		
		callingNTimes ct = new callingNTimes();
		ct.name(2,n);
		
	}
	
	public void name(int i , int n)
	{
		//int i=1;
		if(i>n)
		{
			return;
		}
		System.out.println("Santhoshi M J");
		name(i+2,n);
	}

}
