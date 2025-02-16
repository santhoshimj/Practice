package Arrays;

import java.util.*;

public class UnionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {3,4,5,6,7};
		
		Set<Integer> union = new HashSet<>();
		
		for(int num : arr1)
		{
			union.add(num);
		}
		
		for(int num : arr2)
			union.add(num);
		
		System.out.println(union);
		

	}

}
