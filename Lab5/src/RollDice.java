
public class RollDice {

	static int dice1;
	static int dice2; 

	static void RollDice() { 
		dice1 = (int)(Math.random()*6) + 1;
		dice2 = (int)(Math.random()*6) + 1; 
		
	}
	
	public int getDice1() {
		return dice1;
	}
	
	public int getDice2() {
		return dice2;
	}
	
	public int getTotal() {
		return dice1 + dice2;
	}

	
}
