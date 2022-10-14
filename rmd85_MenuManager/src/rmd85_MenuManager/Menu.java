package rmd85_MenuManager;

public class Menu {
	
	/**
	 * Class Menu
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */
	
	String name; 
	Entree entree; 
	Side side; 
	Salad salad; 
	Dessert dessert; 
	
	public Menu(String name, Entree entree, Salad salad) {
		this.name = name; 
		this.entree = entree; 
		this.salad = salad; 
		this.side = null; 
		this.dessert = null;
		
	}
	
	public Menu(String name, Entree entree, Salad salad, Side side, Dessert dessert) {
		this.name = name; 
		this.entree = entree; 
		this.salad = salad; 
		this.side = side; 
		this.dessert = dessert;
		
	}
	
	
	public Menu(String name, Side side, Salad salad) {
		this.name = name; 
		this.entree = null; 
		this.salad = salad; 
		this.side = side; 
		this.dessert = null;
		
	}


	public int totalCalories() {
		int total = 0;
		if(this.entree!=null) {
			total += this.entree.getCalories();
		}
		if(this.salad!=null) {
			total += this.salad.getCalories();
		}
		if(this.side!=null) {
			total += this.side.getCalories();
		}
		if(this.dessert!=null) {
			total += this.dessert.getCalories();
		}
		return total;
	}
	
	public String description(){
		String description = ""; 
		description += this.name; 
		description +="\n"; 
		
		if (this.entree== null) {
			description += "\n";
			description += "Entree: N/A ";
		}
		else {
			description += "\n";
			description += "Entree: " + this.entree.entreeName;
		}
		if (this.side == null) {
			description += "\n";
			description += "Side: N/A ";
		}
		else {
			description += "\n";
			description += "Side: " + this.side.sideName;
		}
		if (this.salad == null) {
			description += "\n";
			description += "Salad: N/A ";
		}
		else {
			description += "\n";
			description += "Salad: " + this.salad.saladName;
		}
		if (this.dessert== null) {
			description += "\n";
			description += "Dessert: N/A ";
		}
		else {
			description += "\n";
			description += "Dessert: " + this.dessert.dessertName;
		}
		//description +="\n"; 
		return description; 
			
		
	}
	
}

