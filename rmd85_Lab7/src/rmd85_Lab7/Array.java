package rmd85_Lab7;

import java.util.Random;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		String value = JOptionPane.showInputDialog("enter a number of values for the array: ");
		int intValue = Integer.parseInt(value);
		Random rand = new Random();
		double[] data = new double[intValue];
		System.out.println("the random values of the array are: ");
		for(int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt();
			System.out.println(data[i]);
		}
		
		System.out.println("\nthe max of the array: " + max(data));
		System.out.println("the min of the array: " + min(data));
		System.out.println("the sum of the array: " + sum(data));
		System.out.println("the average of the array: " + ave(data));
	}

	private static double max(double[] data) {
		double max = Double.MIN_VALUE;
		for(int i = 0; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max; 
		
	}
	public static double min(double[] data) {
		double min = Double.MAX_VALUE;
		for(int i = 0; i < data.length; i++) {
			if(data[i] < min) {
				min = data[i];
			}
		}
		return min; 
	}
	
	public static double sum(double[] data) {
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
		
	}
	
	public static double ave(double[] data) {
		double sum = 0; 
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		double average = (sum/data.length);
		return average; 
		
	}
	

}
