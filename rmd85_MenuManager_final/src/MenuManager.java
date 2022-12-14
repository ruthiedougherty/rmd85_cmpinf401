

import java.util.ArrayList;

public class MenuManager {
	
	/**
	 * Class MenuManager 
	 * Author: Ruthie Dougherty
	 * created: 11/28/22
	 */
	
	private ArrayList<Entree> entree = new ArrayList<>(); 
	private ArrayList<Side> side = new ArrayList<>(); 
	private ArrayList<Salad> salad = new ArrayList<>(); 
	private ArrayList <Dessert> desserts = new ArrayList<>(); 
	
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> a = FileManager.readItems(dishesFile); 
		for(MenuItem d : a) {
			if(d instanceof Dessert) {
				desserts.add((Dessert) d); 
			}
			else if(d instanceof Entree) {
				entree.add((Entree) d); 
			}
			else if(d instanceof Salad) {
				salad.add((Salad) d); 
			}
			if(d instanceof Side) {
				side.add((Side) d); 
			}
			
		}
		
		//setEntree(FileManager.readItems(dishesFile));
		//setDesserts(FileManager.readItems(dishesFile)); 
		//setSide(FileManager.readItems(dishesFile));
		//setSalad(FileManager.readItems(dishesFile));
		
		
	}
	
	public Menu randomMenu(String name) {
		/**
		 * Method randomMenu
		 * return the menu
		 */ 
		
		Menu Menu = new Menu("Sample Menu"); 
		Menu.setEntree(entree.get((int) ((entree.size())* Math.random())));
		Menu.setDessert(desserts.get((int) ((desserts.size())* Math.random())));
		Menu.setSalad(salad.get((int) ((salad.size())* Math.random())));
		Menu.setSide(side.get((int) ((side.size())* Math.random())));
		return Menu; 
		
	}

	public ArrayList<Entree> getEntree() {
		return entree;
	}

	public void setEntree(ArrayList<Entree> entree) {
		this.entree = entree;
	}

	public ArrayList<Side> getSide() {
		return side;
	}

	public void setSide(ArrayList<Side> side) {
		this.side = side;
	}

	public ArrayList<Salad> getSalad() {
		return salad;
	}

	public void setSalad(ArrayList<Salad> salad) {
		this.salad = salad;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
		
	}
	
	
	
	

}
