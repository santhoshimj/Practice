package Arrays;

public class FindTheLargest {

	public static void main(String[] args) {
		
		int arr[] = {2,5,6,4,7,8,10};
		int largest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				largest = arr[i];
				if(arr[j]>largest)
				{
					largest = arr[j];
				}
				else {
					largest=arr[i];
				}
			}
			
		}
		System.out.println("the largest element in the array is : " + largest);

	}

}
