package menu;

import java.util.Iterator;

public class CookieMenu implements Menu{
	static final int TotalCookies = 4;
	int numberOfCookies = 0;
	MenuItems[] menuItems; 
	
	public CookieMenu() {
		menuItems = new MenuItems[TotalCookies];
		
		addItems("Chewy Chocolate Chip", "A gooey, chewy chocolate chip cookie.", false, 2.25);
		addItems("White Chocolte Chunk", "A vanilla cookie with large chucks of white chocolate.", false, 2.25);
		addItems("No Bake Oatmeal Peanut Butter", "A no bake cookie with oatmeal and creamy peanute butter.", true, 3.25);
		addItems("Lemon", "Soft, lemon cookies that are bright and perfect for summertime.", false, 2.25);
	}
	
	public void addItems(String name, String description, boolean glutenFree, double cost) {
		MenuItems newItem = new MenuItems(name, description, glutenFree, cost);
		menuItems[numberOfCookies] = newItem;
		numberOfCookies++;
		}
	
	public Iterator<MenuItems> createIterator() {
		
		return new CookieMenuIterator(menuItems);
	}

}
