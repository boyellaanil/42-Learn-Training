package assignment1;

public class CharacterCount {
	    public static void main(String[] args) {
	        // Input string
	        String input = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

	        // Counters for letters, spaces, numbers, and other characters
	        int letterCount = 0;
	        int spaceCount = 0;
	        int numberCount = 0;
	        int otherCount = 0;

	        // Loop through the string to count each type of character
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            
	            if (Character.isLetter(ch)) {
	                letterCount++;
	            } else if (Character.isDigit(ch)) {
	                numberCount++;
	            } else if (Character.isSpaceChar(ch)) {
	                spaceCount++;
	            } else {
	                otherCount++;
	            }
	        }

	        // Output the results
	        System.out.println("Letter: " + letterCount);
	        System.out.println("Space: " + spaceCount);
	        System.out.println("Number: " + numberCount);
	        System.out.println("Other: " + otherCount);
	    }
}