package pitt.edu.rmd85.lab2;

import javax.swing.JOptionPane;

public class DecomposingMoney {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Enter a number from 1 dollar to 9999 dollars");
		
		int userInputInt = Integer.parseInt(userInput);
		
		int grands = userInputInt / 1000; 
		int grandsRemainder = userInputInt % 1000;
		
		int hundreds = grandsRemainder / 100;
		int hundredsRemainder = grandsRemainder % 100;
		
		int tens = hundredsRemainder / 10; 
		int tensRemainder = hundredsRemainder % 10;
		
		int ones = tensRemainder; 
		
		System.out.println(grands + " grands");
		System.out.println(hundreds + " hundreds");
		System.out.println(tens + " tens"); 
		System.out.println(ones + " ones");

	}

}
