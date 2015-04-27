package IteratorAndCompositePattern.Component;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zz on 2015/4/27.
 */
public class NewMenu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name ;
    String description;

    public NewMenu(String name, String description) {
        this.description = description;
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("----------------------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }

    }
    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
}
