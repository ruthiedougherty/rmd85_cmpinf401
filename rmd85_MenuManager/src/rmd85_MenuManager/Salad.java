package rmd85_MenuManager;

public class Salad {
	
	/**
	 * Class Salad
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */
	
	String saladName;
	String saladDesc; 
	int saladCal;
	
	public Salad(String name, int calories, String description ) {
		saladName = name; 
		saladDesc = description;
		saladCal = calories;
	}
	public String getName() {
		return saladName;
	}
	public void setName(String name) {
		saladName = name;
	}
	public int getCalories() {
		return saladCal;
	} 
	public void setCalories(int calories) {
		saladCal = calories; 
	}
	public String getDescription() {
		return saladDesc;
	}
	public void setDesc(String description) {
		saladDesc = description;
	}

}
