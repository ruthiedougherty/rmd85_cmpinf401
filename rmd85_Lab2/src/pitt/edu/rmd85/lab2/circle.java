package pitt.edu.rmd85.lab2;

import javax.swing.JOptionPane;
import java.lang.Math; 

public class circle {
	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Enter value for the "
				+ "radius: "); 
		double userInputValue = Double.parseDouble(userInput);
		
		double perimeter = (2* Math.PI * userInputValue);
		
		double area = (Math.PI * userInputValue * userInputValue);
		
		System.out.println("The circle with a radius of: " + userInput + "has an area of: " +
		area + "and a perimeter of: " + perimeter);
	}
}
