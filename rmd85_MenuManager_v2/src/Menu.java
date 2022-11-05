

public class Menu {
	
	/**
	 * Class Menu
	 * Author: Ruthie Dougherty
	 * created: 10/14/22
	 */
	
	private String name; 
	private Entree entree; 
	private Side side; 
	private Salad salad; 
	private Dessert dessert; 
	
	public Menu(String name) {
		this.name = name; 
		//this.entree = null; 
		//this.dessert = null; 
		//this.salad = null; 
		//this.side = null; 
	}
	
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
			description += "Entree: " + this.entree.getName() + ": " + this.entree.getDescription();
		}
		if (this.side == null) {
			description += "\n";
			description += "Side: N/A ";
		}
		else {
			description += "\n";
			description += "Side: " + this.side.getName() + ": " + this.side.getDescription();
		}
		if (this.salad == null) {
			description += "\n";
			description += "Salad: N/A ";
		}
		else {
			description += "\n";
			description += "Salad: " + this.salad.getSaladName() + ": " + this.salad.getDescription();
		}
		if (this.dessert== null) {
			description += "\n";
			description += "Dessert: N/A ";
		}
		else {
			description += "\n";
			description += "Dessert: " + this.dessert.getName() + ": " + this.dessert.getDescription();
		}
		//description +="\n"; 
		return description; 
			
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
}

