// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		String currentvalue = args[0];
		String rate = args[1];
		String years = args[2];
		double cv = Double.parseDouble(currentvalue);
		double y = Double.parseDouble(years);
		double r = Double.parseDouble(rate);
		double fv = cv * Math.pow((1 + r/100), y);
		System.out.println("after " + years + " years, " + cv + "$ " + " saved at " + rate + "% " + " will yield " + (int) fv + "$");	
	
	}
}