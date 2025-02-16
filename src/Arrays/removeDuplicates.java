package Arrays;

import java.util.*;

public class removeDuplicates {
	
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4};
		int newLength = duplicates(arr);
		 System.out.println("Array without duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
	}
	
	 public static int duplicates(int[] arr) {
	        if (arr.length == 0) return 0;

	        int i = 0; // Slow pointer

	        for (int j = 1; j < arr.length; j++) {
	            if (arr[j] != arr[i]) {
	                i++; 
	                arr[i] = arr[j]; // Copy unique element
	            }
	        }
	        return i + 1; // Return the new length
	    }

}
