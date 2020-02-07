package menu;

import java.util.ArrayList;

//Create a class for the counter where a customer can order
public class DessertCounter {

	public static void main(String[] args) {
		//Set the cake menu
		CakeMenu cakeMenu = new CakeMenu();
		//Set the cookie menu
		CookieMenu cookieMenu = new CookieMenu();
		//Create a container to store both menus
		ArrayList<Menu> menus = new ArrayList<Menu>();
		
		//Store both menus
		menus.add(cakeMenu);
		menus.add(cookieMenu);
		//Instantiate the object that will read off the menus to the customer
		DessertCounterHelper waitress = new DessertCounterHelper(menus);
		//Read the menus off
		waitress.printMenu();
	}

}
