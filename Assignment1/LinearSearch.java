package assignment1;
import java.util.Scanner;
public class LinearSearch {
	    public static void main(String[] args) {
	        // Example array of integers
	        int[] array = {10, 23, 45, 70, 11, 15, 100};
	        
	        // Input: Element to search for
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the element to search for: ");
	        int target = scanner.nextInt();
	        
	        // Call linear search function
	        int result = linearSearch(array, target);
	        
	        // Output the result
	        if (result == -1) {
	            System.out.println("Element " + target + " not found in the array.");
	        } else {
	            System.out.println("Element " + target + " found at index: " + result);
	        }
	    }

	    // Linear Search algorithm
	    public static int linearSearch(int[] array, int target) {
	        // Iterate through the array to find the target
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i;  // Return the index of the found element
	            }
	        }
	        return -1;  // Return -1 if the element is not found
	    }
}
