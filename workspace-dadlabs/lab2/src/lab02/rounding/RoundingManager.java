package lab02.rounding;

import java.text.DecimalFormat;

public class RoundingManager {
	
	public double calculatePercentage (int dividend, int divisor) {
		// Parsing the parameter values to double
		double percentage = ((double)dividend / (double)divisor) * 100;
		return percentage;
	}
	
	public String roundValue(double value, int decimalPoints) {
		// Generate decimal points
		String decimalPlaces = ".";
		for (int counter = 0; counter < decimalPoints; counter++)
		decimalPlaces += "0";
		// Generate empty string if requires no decimal points
		if (decimalPoints == 0)
		decimalPlaces = "";
		// Round the value into the specified decimal points
		DecimalFormat formatter = new DecimalFormat("###" + decimalPlaces);
		String result = formatter.format(value);
		return result;
		}
	
	public class RoundingApplication {
		public static void main(String[] args) {
		System.out.println("Main entry point of RoundingApplication");
		int divident = 200;
		int divisor = 357;
		RoundingManager roundManager = new RoundingManager();
		double value = roundManager.calculatePercentage(divident, divisor);
		System.out.println("Progress from " + divisor + "/"
		+ divident + ": " + value + "%");
		int decimalPoints = 2;
		System.out.println("Round to " + decimalPoints + " decimal points: "
				+ roundManager.roundValue(value, decimalPoints) + "%");
				decimalPoints = 0;
				System.out.println("Round to " + decimalPoints + " decimal points: "
				+ roundManager.roundValue(value, decimalPoints) + "%");
				}
	}


}
