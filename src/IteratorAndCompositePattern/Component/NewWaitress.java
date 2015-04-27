package IteratorAndCompositePattern.Component;

import java.util.Iterator;

/**
 * Created by zz on 2015/4/27.
 */
public class NewWaitress {
    MenuComponent allMenu;
    public NewWaitress(MenuComponent allMenu){
        this.allMenu = allMenu;
    }
    public void printMenu(){
        allMenu.print();
    }
    public void printVegetarianMenu(){
        Iterator iterator = allMenu.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try{
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){
            }
        }
    }
}
