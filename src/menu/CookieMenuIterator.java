package menu;

import java.util.Iterator;

//A class created to allow for iterating over the cookie menu
public class CookieMenuIterator implements Iterator {

	//Create a storage container for the menu items
	MenuItems[] list;
	//Keep a count of where you are at in the container
	int position =0;

	public CookieMenuIterator(MenuItems[] list) {
		this.list = list;
	}

	//Check to see if there is a next item
	public boolean hasNext() {
		if(position >= list.length || list[position]== null) {
			return false;
		}
		else {
			return true;
		}
	}

	//Find the next item
	public Object next() {
		MenuItems menuItems = list[position];
		position = position +1;
		return menuItems;
	}
	
	//Remove an item
	public void remove() {
		if(position<=0) {
			throw new IllegalStateException("You can't remove an item until you have moved forward.");
		} if(list[position-1] != null) {
			for(int i = position-1; i <(list.length-1); i++) {
				list[i]= list[i+1];
			}
			list[list.length-1] = null;
		}
	}
	
	

}
 