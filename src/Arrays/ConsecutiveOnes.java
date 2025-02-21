package Arrays;

public class ConsecutiveOnes {

	public static void main(String[] args) {
		
		int arr[] = {1,1,1,0,0,1,5,3,9,1,1,0,0,0,0,0,1,1,1,1};
		consecutiveOness(arr);
	}

	private static int consecutiveOness(int arr[]) {
		int maxcount=0;
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				count++;
				maxcount=Math.max(maxcount, count);
			}else {
				count=0;
			}
		}
		System.out.println("The highest count of the consecutive ones is : " + count);
		return maxcount;
		
	}

}
