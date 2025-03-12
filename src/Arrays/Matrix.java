package Arrays;
import java.util.*;

public class Matrix {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println(" :: Creating the matrix :: ");
	       Scanner scan = new Scanner(System.in);
	       
	       System.out.println("Enter the number of rows and column : ");
	       int row = scan.nextInt();
	       int col = scan.nextInt();
	       
	       int grid[][] = new int[row][col];
	       
	       System.out.println("you have opted for a " + row + " * " + col+ " matix ");
	       
	       System.out.println("Enter the characters in the grid");
	       
	       for(int i=0;i<row;i++)
	       {
	           for(int j=0;j<col;j++)
	           {
	               grid[i][j] = scan.nextInt();
	           }
	       }
	       
	       // Print the matrix
	        System.out.println("Matrix is:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(grid[i][j] + " ");
	            }
	            System.out.println(); // Move to next line after each row
	        }
	        
	        
	    //displaying the diagonal matrix --> top-left to bottom-right
	        System.out.println(" :: Displaying the Diagonals of the matrix --> top-left to bottom-right :: ");
	        for(int i=0;i<row;i++)
	        {
	                System.out.println(grid[i][i]);
	        }
	        
	    //displaying the diagonal matrix --> top-right to bottom-left
	        System.out.println(" :: Displaying the diagonals of the matrix --> top-right to bottom-left");
	        for (int i = 0; i < row && i < col; i++) { // Assuming row == col or adjusting for rectangular matrix
	            System.out.println(grid[i][col - i - 1] + " ");
	        }
	        
	    //displaying the boundary elements 
	        System.out.println(" :: Dsiplaying the boundary elemts of the matrix :: ");
	        for(int i=0;i<row;i++)
	        {
	        	for(int j=0;j<col;j++)
	        	{
	        		if(i==0 || j==0  || i==row-1 || j==col-1)
	        		{
	        			System.out.print(grid[i][j] + "\t");
	        		}
	        		else
	        		{
	        			System.out.print("\t");
	        		}
	        	}
	        	System.out.println();
	        }
	}

}
