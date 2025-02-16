package Arrays;

public class secondLargestNumber {
	
	public static void findSecondNum(int arr[])
	{
		int largest = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				largest=arr[i];
				if(arr[j]>largest)
				{
					largest = arr[j];
				}
			}
		}
		System.out.println("the second largest element in the array is : " + largest);

	}

	public static void main(String[] args) {

		int arr[] = {2,5,6,4,7,8,10};
		secondLargestNumber sc = new secondLargestNumber();
		secondLargestNumber.findSecondNum(arr);

	}

}
