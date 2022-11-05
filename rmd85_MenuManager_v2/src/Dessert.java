

public final class Dessert {

	/**
	 * Class Dessert
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */
	
	private String dessertName; 
	private String dessertDesc; 
	private int dessertCal; 
	
	public Dessert(String name, int calories, String description) {
		dessertName = name; 
		dessertDesc = description;
		dessertCal = calories;
	}
	
	public String getName() {
		return dessertName;
	}
	public void setName(String name) {
		dessertName = name;
	}
	public int getCalories() {
		return dessertCal;
	} 
	public void setCalories(int calories) {
		dessertCal = calories; 
	}
	public String getDescription() {
		return dessertDesc;
	}
	public void setDesc(String description) {
		dessertDesc = description;
	}
}
