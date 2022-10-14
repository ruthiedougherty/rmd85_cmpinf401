package rmd85_MenuManager;

public class Side {
	
	/**
	 * Class Side
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */
	
	String sideName; 
	String sideDesc; 
	int sideCal; 
	
	public Side(String name, int calories, String description) {
		sideName = name; 
		sideDesc = description;
		sideCal = calories;
	}
	
	public String getName() {
		return sideName;
	}
	public void setName(String name) {
		sideName = name;
	}
	public int getCalories() {
		return sideCal;
	} 
	public void setCalories(int calories) {
		sideCal = calories; 
	}
	public String getDescription() {
		return sideDesc;
	}
	public void setDesc(String description) {
		sideDesc = description;
	}


	
}
