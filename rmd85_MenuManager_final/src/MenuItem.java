

public class MenuItem {
	
	/**
	 * Class MenuItem 
	 * Author: Ruthie Dougherty
	 * created: 11/28/22
	 */
	
	protected String name; 
	protected String description; 
	protected int calories; 
	protected double price; 
	
	public MenuItem(String name, String desc, int cal, double price ) {
		this.name = name; 
		description = desc; 
		calories = cal; 
		this.price = price; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name; 
	}
	
	
}
