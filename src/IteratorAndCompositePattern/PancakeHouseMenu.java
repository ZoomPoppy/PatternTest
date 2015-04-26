package IteratorAndCompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zz on 2015/4/26.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast","Pancakes with scramble eggs ,and toast",true,2.99);
        addItem("b","b bbbb",true,2.99);
        addItem("c","c ccc",true,23);
        addItem("d","d ddd",true,1.4);
    }
    public void addItem(String name,String description,
                        boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems(){
        return menuItems;
    }

    @Override
    public Iterator createiterator() {
        return menuItems.iterator();
    }
}
