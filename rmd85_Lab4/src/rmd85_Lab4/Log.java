package rmd85_Lab4;

import javax.swing.JOptionPane; 

public class Log {

	public static void main(String[] args) {
		
		String logInput = JOptionPane.showInputDialog("enter a value for the log: ");
		String baseInput = JOptionPane.showInputDialog("enter a value for the base: ");
		
		
		
		int logValue = Integer.parseInt(logInput);
		int baseValue = Integer.parseInt(baseInput);
		int iterations = 0; 
		
		if(logValue > 0 && baseValue > 1) {
		
			while(logValue >= baseValue) { 
				int calc = logValue / baseValue; 
				logValue = calc; 
				iterations ++; 
			}
			System.out.println(iterations);
		
		}
		else {
			System.out.println("invalid input");
		}
		
		
	}

}
