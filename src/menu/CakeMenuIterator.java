package menu;

import java.util.ArrayList;
import java.util.Iterator;

//A class created to allow for iterating over the cake menu
public class CakeMenuIterator implements Iterator {

	//Create a storage container for the menu items
	ArrayList<MenuItems> list;
	//Keep a count of where you are at in the container
	int position =0;

	public CakeMenuIterator(ArrayList<MenuItems> list) {
		this.list = list;
	}

	//Check to see if there is a next item
	public boolean hasNext() {
		if(position >= list.size()|| list.get(position) == null) {
			return false;
		}
		else {
			return true;
		}
	}

	//Find the next item
	public Object next() {
		MenuItems menuItems = list.get(position);
		position = position +1;
		return menuItems;
	}
	
	//Remove an item
	public void remove() {
		if(position<=0) {
			throw new IllegalStateException("You can't remove an item until you have moved forward.");
		} if(list.get(position-1) != null) {
			for(int i = position-1; i <(list.size()-1); i++) {
				list.set(i, (list.get(i+1)));
			}
			list.set((list.size()-1), null);
		}
	}
	
	

}
 