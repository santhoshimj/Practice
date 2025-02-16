package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotateArray {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		Collections.rotate(arr, -1);
		System.out.println("the left rotation of the array is : " + arr);

	}

}
