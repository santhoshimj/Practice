package Arrays;

import java.util.*;

public class MissingNumbers {

	public static void main(String[] args) {


		int[] arr = {1, 2, 4, 7, 8, 10}; // Missing: 3, 5, 6, 9
        int N = 10;
        
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        System.out.println(set);
        
        System.out.print("Missing Numbers: ");
        for (int i = 1; i <= N; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }

	}

}
