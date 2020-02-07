package menu;

import java.util.ArrayList;
import java.util.Iterator;

public class CakeMenuIterator implements Iterator {

	ArrayList<MenuItems> list;
	int position =0;

	public CakeMenuIterator(ArrayList<MenuItems> list) {
		this.list = list;
	}

	public boolean hasNext() {
		if(position >= list.size()|| list.get(position) == null) {
			return false;
		}
		else {
			return true;
		}
	}

	public Object next() {
		MenuItems menuItems = list.get(position);
		position = position +1;
		return menuItems;
	}
	
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
 