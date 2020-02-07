package menu;

import java.util.ArrayList;

public class DessertCounter {

	public static void main(String[] args) {
		CakeMenu cakeMenu = new CakeMenu();
		CookieMenu cookieMenu = new CookieMenu();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		
		menus.add(cakeMenu);
		menus.add(cookieMenu);
		DessertCounterHelper waitress = new DessertCounterHelper(menus);
		waitress.printMenu();
	}

}
