

public class Salad {
	
	/**
	 * Class Salad
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */
	
	private String saladName;
	private String saladDesc; 
	private int saladCal;
	
	public Salad(String name, int calories, String description ) {
		setSaladName(name); 
		saladDesc = description;
		saladCal = calories;
	}
	public String getName() {
		return getSaladName();
	}
	public void setName(String name) {
		setSaladName(name);
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
	public String getSaladName() {
		return saladName;
	}
	public void setSaladName(String saladName) {
		this.saladName = saladName;
	}

}
