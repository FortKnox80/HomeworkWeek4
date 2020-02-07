package menu;

import java.util.ArrayList;
import java.util.Iterator;

public class DessertCounterHelper {
	ArrayList<Menu> menus;

	public DessertCounterHelper(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	void printMenu(Iterator<MenuItems> iterator) {
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
		while (readMenu.hasNext()) {
			Menu menu = readMenu.next();
			printMenu(menu.createIterator());
		}
	}

}
