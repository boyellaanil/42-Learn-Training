package assignment1;

import java.util.Arrays;

	public class BubbleSort {
	    public static void main(String[] args) {
	        // Example array of integers to sort
	        int[] array = {64, 34, 25, 12, 22, 11, 90};
	        
	        // Call bubble sort function
	        bubbleSort(array);
	        
	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(array));
	    }

	    // Bubble sort algorithm
	    public static void bubbleSort(int[] array) {
	        int n = array.length;
	        boolean swapped;
	        
	        // Outer loop for each pass
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            
	            // Inner loop for comparing adjacent elements
	            for (int j = 0; j < n - 1 - i; j++) {
	                // Swap if the current element is greater than the next element
	                if (array[j] > array[j + 1]) {
	                    // Swap elements
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                    
	                    swapped = true;
	                }
	            }
	            
	            // If no elements were swapped, the array is already sorted
	            if (!swapped) {
	                break;
	            }
	        }
	    }
}
