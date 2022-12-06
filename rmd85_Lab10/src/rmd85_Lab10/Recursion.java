package rmd85_Lab10;

import javax.swing.JOptionPane;

public class Recursion {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Enter value for number: ");
		int intNum = Integer.parseInt(num); 
		int result = sumOfDigit(intNum);
		System.out.println("the sum of the digits in the number is: " + result);
		int[] a = {12, 4, 6, 8}; 
		//pointArrayElements(a, a.length - 1); 
		pointArrayElements(a, a.length - 1);

	}

	
	static int sumOfDigit(int x) {
		if (x == 0) {
			return 0;
		}
		return (x % 10 + sumOfDigit(x/10));
	} 
	
	//static int pointArrayElement(int a[], int index) {
		//System.out.println(a[index]); 

		//if (index == 0) {
			//return a[index];
		//}
		//else {
			//return pointArrayElement(a, (index - 1)); 
		//}

	//}
	
	static void pointArrayElements(int a[], int index) {
		System.out.println(a[index]);
		if (index != 0) {
			pointArrayElements(a, index - 1); 
		}
	}
}
