package IteratorAndCompositePattern;

import IteratorAndCompositePattern.Component.MenuComponent;
import IteratorAndCompositePattern.Component.NewMenu;
import IteratorAndCompositePattern.Component.NewMenuItem;
import IteratorAndCompositePattern.Component.NewWaitress;

/**
 * Created by zz on 2015/4/26.
 */
public class MenuTestDrive {
    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu = new NewMenu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new NewMenu("DINER MENU", "Dinner");
        MenuComponent cafeMenu = new NewMenu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new NewMenu("DESSERT MENU","Dessert of course");

        MenuComponent allMenus = new NewMenu("ALL MENUS","All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(new NewMenuItem("asdf"
                , "spaghetti with Marinara sauce,and a slice of sourdouth bread"
                ,true,3.89));
        dinerMenu.add(new NewMenuItem("qwer"
                , "spaghetti with Marinara sauce,and a slice of sourdouth bread"
                ,true,3.89));
        dinerMenu.add(new NewMenuItem("utey"
                , "spaghetti with Marinara sauce,and a slice of sourdouth bread"
                ,true,3.89));
        dinerMenu.add(new NewMenuItem("Pasta"
                , "spaghetti with Marinara sauce,and a slice of sourdouth bread"
                ,true,3.89));
        dessertMenu.add(new NewMenuItem("apple pie","this is a beautiful applepie",true,888));
        dinerMenu.add(dessertMenu);
        NewWaitress w = new NewWaitress(allMenus);
        w.printVegetarianMenu();
    }
}