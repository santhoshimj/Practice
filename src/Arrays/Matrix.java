package Arrays;
import java.util.*;

public class Matrix {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println(" :: Dimensions of the Matrix ::");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows of the Matrix : ");
		int nrows=scan.nextInt();
		System.out.println("Enter the columns of the Matrix : ");
		int ncols = scan.nextInt();
		
		System.out.println("---------------------------------------------");
		System.out.println("So the matrix that you want is a " + nrows + " * " + ncols +" " + "Matrix");
		@SuppressWarnings("unused")
		
		//array of 2D is created here : 
		int arr[][] = new int[nrows][ncols];
		
		//code for the creation of the matrix:
		System.out.println(" :: Enter the values of the Matrix :: ");
		for(int i=0;i<nrows;i++)
		{
			for(int j=0;j<ncols;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		
		//displaying the contents of the matrix : 
		System.out.println(":: Displaying the contents of the Matrix ::");
        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < ncols; j++) {
                System.out.print(arr[i][j] + " "); // Print values in the same row
            }
            System.out.println(); // Move to the next line after each row
        }

        scan.close();
	}

}
