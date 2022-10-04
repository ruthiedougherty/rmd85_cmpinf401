import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		RollDice dice;
		int rollCount = 0;
		int num1 = 0; 
		int num2 = 0;
		int num3 = 0; 
		int num4 = 0; 
		int num5 = 0; 
		int num6 = 0; 
		int num7 = 0;
		int num8 = 0; 
		int num9 = 0; 
		int num10 = 0;
		int num11 = 0;
		int num12 = 0; 
		
		
		dice = new RollDice();
		
		String userInput = JOptionPane.showInputDialog("how many times would you like to roll your die: ");
		int userInt = Integer.parseInt(userInput); 
		
		while(rollCount <= userInt) {
			RollDice.RollDice();
			int value = dice.getTotal();
			
			if(value == 2) {
				num2 ++; 
			}
			
			else if(value == 3) {
				num3 ++;
			}
			
			else if(value == 4) {
				num4 ++; 
			}
			
			else if(value == 5) {
				num5 ++; 
			}
			
			else if(value == 6) {
				num6 ++;
			}
			
			else if(value == 7) {
				num7 ++;
			}
			
			else if(value == 8) {
				num8 ++;
			}
			
			else if(value == 9) {
				num9 ++;
			}
			
			else if(value == 10) {
				num10 ++;
			}
			
			else if(value == 11) {
				num11 ++;
			}
			
			else if(value == 12) {
				num12 ++;
			}
				
			rollCount ++; 
			
			
		}
		
		System.out.println("the number 2 show up " +  num2 + " in " + userInt + " rolls" );
		System.out.println("the number 3 show up " +  num3 + " in " + userInt + " rolls" );
		System.out.println("the number 4 show up " +  num4 + " in " + userInt + " rolls" );
		System.out.println("the number 5 show up " +  num5 + " in " + userInt + " rolls" );
		System.out.println("the number 6 show up " +  num6 + " in " + userInt + " rolls" );
		System.out.println("the number 7 show up " +  num7 + " in " + userInt + " rolls" );
		System.out.println("the number 8 show up " +  num8 + " in " + userInt + " rolls" );
		System.out.println("the number 9 show up " +  num9 + " in " + userInt + " rolls" );
		System.out.println("the number 10 show up " +  num10 + " in " + userInt + " rolls" );
		System.out.println("the number 11 show up " +  num11 + " in " + userInt + " rolls" );
		System.out.println("the number 12 show up " +  num12 + " in " + userInt + " rolls" );

	}

}
