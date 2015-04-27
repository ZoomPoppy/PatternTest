package IteratorAndCompositePattern;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by zz on 2015/4/27.
 */
public class CafeMenu implements  Menu{
    Hashtable menuItems = new Hashtable();
     public CafeMenu(){
         addItem("veggie Burger and air fries","veggie burger on a whole wheat bun ,lettuce ,tomato ,and fries",true,3.99);
         addItem("Soup of the day","a cup of the soup of the dau,with a side salad",false,3.69);
         addItem("Burrito","A large burrito ,with whole pinto beans ,salsa ,guacamole",true,4.28);
     }
    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    @Override
    public Iterator createiterator() {
        return menuItems.values().iterator();
    }
}
