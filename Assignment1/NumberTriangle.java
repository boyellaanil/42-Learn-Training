package assignment1;

public class NumberTriangle {
	    public static void main(String[] args) {
	        int number = 1;  // Starting number
	        
	        // Outer loop to control the number of rows
	        for (int i = 1; i <= 4; i++) {  // 4 rows for the pattern
	            // Inner loop to control the numbers in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(number + " ");
	                number++;  // Increment the number
	            }
	            System.out.println();  // Move to the next line after each row
	        }
	    }
}
