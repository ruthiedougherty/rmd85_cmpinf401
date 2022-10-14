package rmd85_MenuManager;

public class Entree {
	
	/**
	 * Class Entree 
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */
	
	String entreeName;
	String entreeDesc; 
	int entreeCal;
	
	public Entree(String name, int calories,  String description ) {
		entreeName = name; 
		entreeDesc = description;
		entreeCal = calories;
	}
	

	public String getName() {
		return entreeName;
	}
	public void setName(String name) {
		entreeName = name;
	}
	public int getCalories() {
		return entreeCal;
	} 
	public void setCalories(int calories) {
		entreeCal = calories; 
	}
	public String getDescription() {
		return entreeDesc;
	}
	public void setDesc(String description) {
		entreeDesc = description;
	}
	
}
