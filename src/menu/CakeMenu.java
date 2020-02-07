package menu;

import java.util.ArrayList;
import java.util.Iterator;

//This menu implements the menu class to create a menu specifically for cakes

public class CakeMenu implements Menu{
	ArrayList<MenuItems> menuItems; 
	
	public CakeMenu() {
		//Create a new arraylist to store all of the items for the menu in
		menuItems = new ArrayList<MenuItems>();
		
		//Add the different cakes to the menu along with their price, and whether they are gluten free
		addItems("Dark Chocolate Fudge Cake", "A rich, flourless chocolate cake that is remeniscent of fudge. Comes with a white chocolate gonache.", true, 5.25);
		addItems("Devilishly Good Red Velvet Cake", "A creamy, chocolate cake with aa gorgeous, rich red color to it. This cake is forsted with a decaent cream cheese frosting.", false, 6.25);
		addItems("Galaxy Cake", "Galaxy colors are swirled throughout this cake in patterns that are different every time. \n A lavender filling with edible gold flakes is sandwiched in between each layer, and the whole cake is covered in a sparkling, mirror glaze.", false, 7.25);
		addItems("Starwberry Cake", "Soft, light, vanilla spoge cakes are layerd with cooked, fresh strawberries and homemade whipped cream. The top layer is covered in fresh strawberries and cream.", false, 5.25);
	}
	
	//Method for adding the items to the menu
	public void addItems(String name, String description, boolean glutenFree, double cost) {
		MenuItems newItem = new MenuItems(name, description, glutenFree, cost);
		menuItems.add(newItem);
		}
	
	//An iterator that can run through all the items on the menu
	public Iterator<MenuItems> createIterator() {
		
		return new CakeMenuIterator(menuItems);
	}
}
