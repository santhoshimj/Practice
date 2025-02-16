package Arrays;

public class LinearSearch {
	static boolean flag;

	public static void main(String[] args) {
		int[] arr= {10,40,39,60,35,67,50};
		int key=55;
		//boolean flag=false;
		FuncLinearSearch(arr,key);

	}
	private static int FuncLinearSearch(int[] arr,int key) {
		
		for(int i=0;i<arr.length;i++) {
			if (key==arr[i]) {
				System.out.println("the key is found in the index " + i);
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("key not found");
		}
		return 0;
		
	}

}
