package rmd85_MenuManager_v3;

import java.util.ArrayList;

public class MenuManager {
	
	private ArrayList<MenuItem> entree; 
	private ArrayList<MenuItem> side; 
	private ArrayList<MenuItem> salad; 
	private ArrayList <MenuItem> desserts; 
	
	public MenuManager(String dishesFile) {
		setEntree(FileManager.readItems(dishesFile));
		setDesserts(FileManager.readItems(dishesFile)); 
		setSide(FileManager.readItems(dishesFile));
		setSalad(FileManager.readItems(dishesFile));
		
		
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

	public ArrayList<MenuItem> getEntree() {
		return entree;
	}

	public void setEntree(ArrayList<MenuItem> entree) {
		this.entree = entree;
	}

	public ArrayList<MenuItem> getSide() {
		return side;
	}

	public void setSide(ArrayList<MenuItem> side) {
		this.side = side;
	}

	public ArrayList<MenuItem> getSalad() {
		return salad;
	}

	public void setSalad(ArrayList<MenuItem> salad) {
		this.salad = salad;
	}

	public ArrayList<MenuItem> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<MenuItem> desserts) {
		this.desserts = desserts;
	}
	
	
	
	

}
