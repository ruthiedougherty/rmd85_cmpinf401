


public class MenuTest {
	
	/**
	 * Class MenuTest
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */

	public static void main(String[] args) {
		MenuManager randomize = new MenuManager("data/dishes.txt");
		Menu myMenu = randomize.randomMenu("Menu");
		System.out.println(myMenu.description()+ "\nTotal Calories " + myMenu.totalCalories());
		
		Entree e = (Entree) new MenuItem(null, null, 0, 0);
	}
		
}
