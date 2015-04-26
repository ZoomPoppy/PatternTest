package IteratorAndCompositePattern;

/**
 * Created by zz on 2015/4/26.
 */
public class MenuTestDrive {
    public static void main(String args[]){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);

        waitress.printMenu();
    }
}
