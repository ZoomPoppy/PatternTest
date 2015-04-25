package TemplateMeathPattern;

import java.util.Arrays;

/**
 * Created by zz on 2015/4/25.
 */
public class DuckSortDrive {
    public static void main(String[] args){
        Duck[] ducks = {
                new Duck("Daffy",8),
                new Duck("b",23),
                new Duck("c",14),
                new Duck("d",8),
                new Duck("e",9),
                new Duck("f",3)
        };
        System.out.println("Before sorting: ");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("after sorting: ");
        display(ducks);

    }
    public static void display(Duck[] ducks){
        for (int i= 0;i<ducks.length;i++){
            System.out.println(ducks[i]);
        }
    }


}
