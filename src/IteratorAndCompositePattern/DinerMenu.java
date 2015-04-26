package IteratorAndCompositePattern;

import java.util.Iterator;

/**
 * Created by zz on 2015/4/26.
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberItems = 0 ;
    MenuItem[] menuItems;
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("da","da  aaa",true,2.99);
        addItem("db","db bbb",true,3.0);
    }
    public void addItem(String name,String description,
                        boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if (numberItems>=MAX_ITEMS){
            System.err.println("Sorry , menu is full! Can't add item to menu");
        }
        else {
            menuItems[numberItems] = menuItem;
            numberItems = numberItems + 1;
        }

    }
    public MenuItem[] getMenuItems(){
        return menuItems;
    }
    @Override
    public Iterator createiterator() {
        return new DinerMenuIterator(menuItems);
    }
}
