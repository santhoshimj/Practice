package Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
        int[] arr = new int[3];               
        
        Funki funki = new Funki(); // Create an instance of Funki class
        
        // Pass the array and Scanner to the methods
        funki.acceptValues(arr, scan);
        funki.printTheValues(arr);
		
}
}

class Funki{
	
	// Method to accept values into the array
    void acceptValues(int[] arr, Scanner scan) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value for index " + i + ":");
            arr[i] = scan.nextInt();  
        }
    }
    
    void printTheValues(int[] arr) {
        System.out.println("Values in the array are:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
	
}