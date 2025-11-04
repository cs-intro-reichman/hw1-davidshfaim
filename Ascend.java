// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		String number = args[0];
		double num = Double.parseDouble(number);
		double ran1 = Math.random() ;
		double ran2 = Math.random() ;
		double ran3 = Math.random() ;
		double a = ran1 * num + 1; 
		double b = ran2 * num + 1;
		double c = ran3 * num + 1;
		System.err.println((int)a + " " +(int)b + " " + (int)c);
        double max = Math.max(a , Math.max(b, c));
		double min = Math.min(a , Math.min(b, c));
		double even = (a + b + c) - (max + min);
		System.out.println((int)min + " " +(int)even + " " + (int)max);

	}
}
