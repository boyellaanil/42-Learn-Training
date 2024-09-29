package assignment1;
	import java.util.Scanner;

	public class BinaryToDecimal {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the binary number
	        System.out.print("Input a binary number: ");
	        String binaryString = scanner.nextLine();

	        // Convert the binary number to decimal
	        int decimalNumber = Integer.parseInt(binaryString, 2);

	        // Output the decimal result
	        System.out.println("Decimal Number: " + decimalNumber);
	        scanner.close();
	    }
}
