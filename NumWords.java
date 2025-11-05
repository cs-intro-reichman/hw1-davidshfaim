// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String number = args[0];
		double num = Double.parseDouble(number);
		double hundreds = Math.floor(num / 100);
		double tens = Math.floor((num / hundreds) / 100 ) ;
		double units = num % 10 ;
		System.out.println((int)hundreds + " hundreds" + ", " + (int)tens + " tens," + " and " + (int)units + " ones.");




	}
}
