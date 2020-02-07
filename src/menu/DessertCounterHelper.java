package menu;

import java.util.ArrayList;
import java.util.Iterator;

//Create a class that can read out all of the menus
public class DessertCounterHelper {
	ArrayList<Menu> menus;

	public DessertCounterHelper(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	//A method to print out items that are on the menu
	void printMenu(Iterator<MenuItems> iterator) {
		//While there is still another item on the menu print it
		while (iterator.hasNext()) {
			MenuItems menuItem = (MenuItems) iterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.glutenFree);
			System.out.println("$ " + menuItem.getCost());
		}
	}

	public void printMenu() {
		Iterator<Menu> readMenu = menus.iterator();
		//While there is still an item on the menu, print it out using the above print menu method
		while (readMenu.hasNext()) {
			Menu menu = readMenu.next();
			printMenu(menu.createIterator());
		}
	}

}
