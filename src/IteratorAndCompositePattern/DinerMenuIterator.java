package IteratorAndCompositePattern;


import java.util.Iterator;

/**
 * Created by zz on 2015/4/26.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int positon = 0;
    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if (positon>=items.length||items[positon]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[positon];
        positon = positon+1;
        return menuItem;
    }

    @Override
    public void remove() {
        if(positon <= 0) {
            throw new IllegalStateException("you can't remove an item until you 've done at least one next()");
        }
        if (items[positon-1] != null){
            for (int i = positon - 1;i<(items.length-1);i++){
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }

}
