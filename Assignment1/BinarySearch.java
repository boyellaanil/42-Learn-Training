package assignment1;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	    public static void main(String[] args) {
	        // Example array of integers (must be sorted for binary search)
	        int[] array = {10, 23, 45, 70, 11, 15, 100};
	        
	        // Sorting the array before performing binary search
	        Arrays.sort(array);
	        
	        // Input: Element to search for
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the element to search for: ");
	        int target = scanner.nextInt();
	        
	        // Call binary search function
	        int result = binarySearch(array, target);
	        
	        // Output the result
	        if (result == -1) {
	            System.out.println("Element " + target + " not found in the array.");
	        } else {
	            System.out.println("Element " + target + " found at index: " + result);
	        }
	    }

	    // Binary Search algorithm
	    public static int binarySearch(int[] array, int target) {
	        int low = 0;
	        int high = array.length - 1;
	        
	        // Iterative binary search
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            
	            // Check if the target is at the middle
	            if (array[mid] == target) {
	                return mid;
	            }
	            
	            // If target is greater, ignore the left half
	            if (array[mid] < target) {
	                low = mid + 1;
	            }
	            // If target is smaller, ignore the right half
	            else {
	                high = mid - 1;
	            }
	        }
	        
	        return -1;  // Element not found
	    }
}
