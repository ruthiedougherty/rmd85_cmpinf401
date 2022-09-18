package rmd85_Lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter a value and unit to be converted: ");
		
		int numberIndex = input.indexOf(" ");
		
		String unit = input.substring(numberIndex);
		
		String number = input.substring(0, numberIndex);
		
		double value = Double.parseDouble(number);
		
		if (unit.equals(" cm")){
			double newValue = value * .393701;
			System.out.println("cm to in:" + newValue + " in");
		}
		
		else if (unit.equals(" in")) {
			double newValue = value * 2.54;
			System.out.println("your conversion for: " + input + 
					" to cm is: " + newValue + " cm");
			
		}
		
		else if (unit.equals(" yd")) {
			double newValue = value * .9144;
			System.out.println("your conversion for: " + input + " to m is: "
					+ newValue + "m");
		}
		
		else if (unit.equals(" m")) {
			double newValue = value * 1.09361;
			System.out.println("your conversion for " + input + 
					" to yd is: " + newValue + " yd");
		}
		
		else if (unit.equals(" gm")) { 
			double newValue = value * .035274;
			System.out.println("your conversion for " + input + 
					" to oz is: " + newValue + " oz");
		}
		
		else if (unit.equals(" oz")) {
			double newValue = value * 28.3495; 
			System.out.println("your conversion for " + input + 
					" to gm is: " + newValue + " gm");
		}
		
		else if (unit.equals(" lb")) { 
			double newValue = value * .43592; 
			System.out.println("your conversion for " + input + 
					" to kg is: " + newValue + " kg");
		}
		
		else if (unit.equals(" kg")) { 
			double newValue = value * 2.20462; 
			System.out.println("your conversion for " + input + 
					" to lb is: " + newValue + " lb");
		}
		
		else {
			System.out.println("invalid input");
		}



	}

}
