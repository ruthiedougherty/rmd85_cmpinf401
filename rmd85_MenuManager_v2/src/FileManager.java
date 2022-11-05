import java.io.BufferedReader;

import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;


public class FileManager {
	
	/**
	 * Class FileManager
	 * Author: Ruthie Dougherty
	 * created: 11/4/22
	 */
	
	final static String SPLIT = "@@"; 
	
	public static ArrayList<Dessert> readDessert(String fileName){
		/**
		 * Method ArrayList<Dessert> 
		 * param fileName a string file name for desserts 
		 * return the array
		 */
		
		ArrayList<Dessert> dessert = new ArrayList<Dessert>(); 
		
		
		try { 
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null; 
			while ((line = br.readLine()) != null) {
				String [] temp = line.split("@@");
				if (temp.length == 3) {
					String dessertName = temp[0];
					String dessertDesc = temp[1];
					String dessertCal = temp[2];
					int dessertCalInt = Integer.parseInt(dessertCal);
					Dessert d = new Dessert(dessertName, dessertCalInt, dessertDesc);
					dessert.add(d);
				}
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return dessert;
	}
	
	public static ArrayList<Entree> readEntrees(String fileName){
		
		/**
		 * Method ArrayList<Entree> 
		 *param fileName a string file name for entree 
		 * return the array
		 */
		
		
		ArrayList<Entree> entree = new ArrayList<Entree>(); 
		//int value = 0; 
		
		try { 
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null; 
			while ((line = br.readLine()) != null) {
				String [] temp = line.split("@@");
				if (temp.length == 3) {
					String entreeName = temp[0];
					String entreeDesc = temp[1];
					String entreeCal = temp[2];
					int entreeCalInt = Integer.parseInt(entreeCal);
					Entree e = new Entree(entreeName, entreeCalInt, entreeDesc);
					entree.add(e);
				}
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return entree;
	}
	
	public static ArrayList<Salad> readSalad(String fileName){
		
		/**
		 * Method ArrayList<Salad> 
		 * param fileName a string file name for salad 
		 * return the array
		 */
		
		
		ArrayList<Salad> salad = new ArrayList<Salad>(); 
		//int value = 0; 
		
		try { 
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null; 
			while ((line = br.readLine()) != null) {
				String [] temp = line.split("@@");
				if (temp.length == 3) {
					String saladName = temp[0];
					String saladDesc = temp[1];
					String saladCal = temp[2];
					int saladCalInt = Integer.parseInt(saladCal);
					Salad d = new Salad(saladName, saladCalInt, saladDesc);
					salad.add(d);
				}
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return salad;
	}
	
	public static ArrayList<Side> readSide(String fileName){
		
		/**
		 * Method ArrayList<Side> 
		 * param fileName a string file name for sides 
		 * return the array
		 */
		
		
		ArrayList<Side> side = new ArrayList<Side>(); 
		//int value = 0; 
		
		try { 
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null; 
			while ((line = br.readLine()) != null) {
				String [] temp = line.split("@@");
				if (temp.length == 3) {
					String sideName = temp[0];
					String sideDesc = temp[1];
					String sideCal = temp[2];
					int sideCalInt = Integer.parseInt(sideCal);
					Side d = new Side(sideName, sideCalInt, sideDesc);
					side.add(d);
				}
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return side; 
		
	}
	
	
	
	
	



}
