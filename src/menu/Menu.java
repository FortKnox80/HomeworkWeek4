package menu;
import java.util.Iterator;

//The interface for all menus. 
public interface Menu {
	
	//Each menu will be able to create an iterator
	public Iterator<MenuItems> createIterator();

}
