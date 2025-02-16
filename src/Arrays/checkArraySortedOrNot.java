package Arrays;

import java.util.*;

public class checkArraySortedOrNot {

	public static void check(int arr[])
	{
		// Create a copy of the original array
        int sortedArr[] = arr.clone(); 
        
        // Sort the copied array
        Arrays.sort(sortedArr);

        // Compare both arrays
        if (Arrays.equals(arr, sortedArr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
	}
	public static void main(String[] args) {
		int arr[]= {2,5,6,4,7,8,10,1,0};
		//checkArraySortedOrNot ca = new checkArraySortedOrNot();
		check(arr);

	}

}
