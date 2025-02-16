package Arrays;

import java.util.*;

public class MoveZerosTOEnd {

	public static void main(String[] args) {
		
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9));
        
        moveZeros(list);
        System.out.println(list);
    }

	public static void moveZeros(List<Integer> list) {
        int zeroCount = Collections.frequency(list, 0); // Count zeros
        
        list.removeAll(Collections.singleton(0)); // Remove all zeros
        
        for (int i = 0; i < zeroCount; i++) { // Add zeros at the end
            list.add(0);
        }
    }

}
