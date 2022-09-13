package pitt.edu.rmd85.lab2;

import javax.swing.JOptionPane;
import java.lang.Math; 

public class pythagorean {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please enter a value for "
				+ "side A of the triangle: ");
		
		String userInput2 = JOptionPane.showInputDialog("Please enter a value for "
				+ "side B of the triangle: ");

		int userInputInt = Integer.parseInt(userInput);
		int userInputInt2 = Integer.parseInt(userInput2);
		
		int sideA = (int) Math.pow(userInputInt, 2);
		int sideB = (int) Math.pow(userInputInt2, 2); 
		
		int sideC = (int) sideA + sideB; 
		double finalSideC = (int) Math.sqrt(sideC);
		double hypotenuseLength = finalSideC * 100; 
		int r = (int) Math.round(hypotenuseLength);
		double c = (r / 100.0);
		
		System.out.println("The length of your hypotenuse is: " + c); 
	}

}
