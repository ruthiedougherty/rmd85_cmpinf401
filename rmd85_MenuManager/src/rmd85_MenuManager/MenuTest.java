package rmd85_MenuManager;

public class MenuTest {
	
	/**
	 * Class MenuTest
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */

	public static void main(String[] args) {
		Entree entree1 = new Entree("Chicken Parm ", 300, "Fried chicken cutlets with red sauce and spaghetti");
		Salad salad1 = new Salad("Caeser Salad ", 94, "Romaine lettuce with creamy caeser dressing");
		
		Menu menu1 = new Menu("\nOption 1", entree1, salad1);
		System.out.println(menu1.description());
		System.out.println("\ntotal calories: " + menu1.totalCalories());
		
		
		Entree entree2 = new Entree("Fettucine Alfredo ", 415, "Pasta in a creamy cheese sauce");
		Side side = new Side("Garlic Bread ", 206, "baguette baked with garlic butter");
		Salad salad2 = new Salad("House Salad ", 70, "Romaine lettuce with signarture house dressing");
		Dessert dessert = new Dessert("Cannoli ", 240, "Pastry filled with cream cheese and chocolate chips");

		
		Menu menu2 = new Menu("\nOption 2", entree2, salad2, side, dessert);
		System.out.println(menu2.description());
		
		System.out.println("\ntotal calories: " + menu2.totalCalories());

	}

}
