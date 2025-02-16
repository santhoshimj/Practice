package Arrays;

import java.util.Arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		
		 int[]  arr= {23,56,75,34,1};
		 
		 
//		 int min =  minimumInTheArray(arr);
//		 System.out.println("the minimum number in the array is : " + min);
//		 
//		 int max = maximumInTheArray(arr);
//		 System.out.println("The maximum in the array is : " + max);
//		 
//	}
//
//	private static int maximumInTheArray(int[] arr) {
//		// TODO Auto-generated method stub
//		int max=arr[0];
//		int n=arr.length;
//		
//		for(int i=0;i<n;i++) {
//			if(arr[i]>=max)
//				max=arr[i];
//		}
//		
//		return max;
//	}
//
//	private static int minimumInTheArray(int[] arr) {
//		// TODO Auto-generated method stub
//		int n = arr.length;
//		int min=arr[0];
//		for(int i=0;i<n;i++) {
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		return min;
		
		
		int min = Arrays.stream(arr).min().orElseThrow();
		int max = Arrays.stream(arr).max().orElseThrow(() -> new IllegalArgumentException("Array is empty!"));
		System.out.println("the min value is : " + min);
		System.out.println("the max value is : " + max);
		
		
	}
	
}
