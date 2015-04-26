package IteratorAndCompositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by zz on 2015/4/26.
 */
public class PancakeMenuIterator implements Iterator {
    ArrayList menuItems;
    int position;
    public PancakeMenuIterator(ArrayList menuItems){
         this.menuItems = menuItems;
    }
    @Override
    public boolean hasNext() {
        if (position>=menuItems.size()){
            return false;
        }
        else return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem =(MenuItem)menuItems.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {

    }

}
