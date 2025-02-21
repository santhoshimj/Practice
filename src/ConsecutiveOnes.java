import java.util.*;
public class ConsecutiveOnes {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int size = scanner.nextInt();
	        int[] nums = new int[size];

	        System.out.println("Enter elements (only 0s and 1s): ");
	        for (int i = 0; i < size; i++) {
	            nums[i] = scanner.nextInt();
	        }

	        System.out.println("Maximum consecutive ones: " + findMaxConsecutiveOnes(nums));
	        scanner.close();

	}
	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++; 
                maxCount = Math.max(maxCount, count); // Update max if needed
            } else {
                count = 0; // Reset count if 0 is found
            }
        }
        return maxCount;
    }
}
