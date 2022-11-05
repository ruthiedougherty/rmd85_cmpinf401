

public class MenuTest {
	
	/**
	 * Class MenuTest
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */

	public static void main(String[] args) {
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt", 
				"data/sides.txt", "data/salads.txt", "data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+ "\nTotal Calories " + myMenu.totalCalories());
	}
		
}
