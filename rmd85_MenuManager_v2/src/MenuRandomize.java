import java.util.ArrayList;

public class MenuRandomize {
	
	/**
	 * Class MenuRandomize
	 * Author: Ruthie Dougherty
	 * created: 11/4/22
	 */ 
	
	private ArrayList<Entree> entrees = new ArrayList<Entree>(); 
	private ArrayList<Side> sides = new ArrayList<Side>(); 
	private ArrayList<Salad> salad = new ArrayList<Salad>(); 
	private ArrayList<Dessert> dessert = new ArrayList<Dessert>(); 
	
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		setEntrees(FileManager.readEntrees(entreeFile));
		setDessert(FileManager.readDessert(dessertFile));
		setSalad(FileManager.readSalad(saladFile));
		setSides(FileManager.readSide(sideFile));
		
		
		
	}
	public Menu randomMenu() {
		/**
		 * Method randomMenu
		 * return the menu
		 */ 
		
		Menu Menu = new Menu("Sample Menu"); 
		Menu.setEntree(entrees.get((int) ((entrees.size())* Math.random())));
		Menu.setDessert(dessert.get((int) ((dessert.size())* Math.random())));
		Menu.setSalad(salad.get((int) ((salad.size())* Math.random())));
		Menu.setSide(sides.get((int) ((sides.size())* Math.random())));
		return Menu; 
		
	}
	

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalad() {
		return salad;
	}

	public void setSalad(ArrayList<Salad> salad) {
		this.salad = salad;
	}

	public ArrayList<Dessert> getDessert() {
		return dessert;
	}

	public void setDessert(ArrayList<Dessert> dessert) {
		this.dessert = dessert;
	}
	
	
}
