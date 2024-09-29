package assignment1;
import java.util.Arrays;
public class QuickSort {
	    public static void main(String[] args) {
	        // Example array of integers to sort
	        int[] array = {64, 34, 25, 12, 22, 11, 90};
	        
	        // Call quick sort function
	        quickSort(array, 0, array.length - 1);
	        
	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(array));
	    }

	    // QuickSort algorithm
	    public static void quickSort(int[] array, int low, int high) {
	        if (low < high) {
	            // Find pivot element such that elements smaller than pivot are on the left,
	            // and elements greater than pivot are on the right
	            int pivotIndex = partition(array, low, high);

	            // Recursively sort the left and right parts
	            quickSort(array, low, pivotIndex - 1);
	            quickSort(array, pivotIndex + 1, high);
	        }
	    }

	    // Partition function to place the pivot element at the correct position
	    public static int partition(int[] array, int low, int high) {
	        // Choose the rightmost element as pivot
	        int pivot = array[high];
	        int i = low - 1; // Pointer for the smaller element

	        // Compare each element with the pivot
	        for (int j = low; j < high; j++) {
	            if (array[j] < pivot) {
	                i++; // Move the boundary of smaller elements to the right
	                // Swap array[i] and array[j]
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }

	        // Swap the pivot element with the element at i+1 so that pivot is at its correct position
	        int temp = array[i + 1];
	        array[i + 1] = array[high];
	        array[high] = temp;

	        return i + 1; // Return the index of the pivot
	    }
}
