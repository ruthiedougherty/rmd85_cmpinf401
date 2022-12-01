package rmd85_MenuManager_v3;
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
		 * Method ArrayList<Dessert> 
		 * param fileName a string file name for desserts 
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
					String type = temp[1];
					String desc = temp[2];
					String cal = temp[3];
					String price = temp[4];
					int calInt = Integer.parseInt(cal);
					double priceDouble = Double.parseDouble(price);
					MenuItem d = new MenuItem(name, desc, calInt, priceDouble);
					items.add(d);
				}
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return items;
	}
	
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter(fileName); 
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i =0; i< menus.size(); i++) {
				Menu menu1 = menus.get(i); 
				bw.write(menu1.description()); 
				bw.newLine();
			}
			System.out.println(bw);
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	
	
	



}
