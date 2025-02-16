package Arrays;

import java.util.*;

public class RotateDElements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of places you wanted to rotate the array");
		int D = scan.nextInt();
		
		List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
		
		Collections.rotate(arr, -D);
		System.out.println("The final array is : " + arr);
		
	}

}
