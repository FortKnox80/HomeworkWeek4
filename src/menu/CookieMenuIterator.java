package menu;

import java.util.Iterator;

public class CookieMenuIterator implements Iterator {

	MenuItems[] list;
	int position =0;

	public CookieMenuIterator(MenuItems[] list) {
		this.list = list;
	}

	public boolean hasNext() {
		if(position >= list.length || list[position]== null) {
			return false;
		}
		else {
			return true;
		}
	}

	public Object next() {
		MenuItems menuItems = list[position];
		position = position +1;
		return menuItems;
	}
	
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
 