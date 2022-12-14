
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileManager {
	
	/**
	 * Class FileManager
	 * Author: Ruthie Dougherty
	 * created: 11/4/22
	 */
	
	final static String SPLIT = "@@"; 
	
	public static ArrayList<MenuItem> readItems(String fileName){
		/**
		 * Method ArrayList<MenuItem> 
		 * param fileName a string file name for menu items 
		 * return the array
		 */
		
		ArrayList<MenuItem> items = new ArrayList<MenuItem>(); 
		
		
		try { 
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null; 
			while ((line = br.readLine()) != null) {
				String [] temp = line.split("@@");
				if (temp.length == 5) {
					String name = temp[0];
					String desc = temp[2];
					String cal = temp[3];
					String price = temp[4];
					int calInt = Integer.parseInt(cal);
					double priceDouble = Double.parseDouble(price);
					MenuItem d;
					if(temp[1].equals("Entree")){
						d = new Entree(name, desc, calInt, priceDouble);
						items.add(d);
					}
					else if(temp[1].equals("Dessert")) {
						d = new Dessert(name, desc, calInt, priceDouble);
						items.add(d);
					}
					else if(temp[1].equals("Salad")) {
						d = new Salad(name, desc, calInt, priceDouble);
						items.add(d);
					}
					else if(temp[1].equals("Side")) {
						d = new Side(name, desc, calInt, priceDouble);
						items.add(d);
					}
				}
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return items;
	}
	
	public static void writeMenus(String fileName, ArrayList<Menu> menus) {
		
		/**
		 * Method writeMenu
		 * param fileName a string file name, Array List
		 */
		
		
		try {
			FileWriter fw = new FileWriter(fileName); 
		//	BufferedWriter bw = new BufferedWriter(fw);
			for(int i =0; i< menus.size(); i++) {
				Menu menu = menus.get(i); 
				fw.write(menu.description()); 
				//fw.newLine();
			}
			System.out.println(fw);
			fw.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	
	
	



}
