package TemplateMeathPattern;

/**
 * Created by zz on 2015/4/25.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourIncup();
        if(customeWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourIncup(){
        System.out.println("Pouring into cup");
    }
    boolean customeWantsCondiments(){
        return true;
    }
}
