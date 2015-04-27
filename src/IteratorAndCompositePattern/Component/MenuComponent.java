package IteratorAndCompositePattern.Component;

import java.util.Iterator;

/**
 * Created by zz on 2015/4/27.
 */
//组合模式
//所有的目录菜单都会实现这个接口（实现接口 并不只代表一种意思）
//无论是菜单目录还是菜单项 都会实现
public abstract class MenuComponent {

    /*有些子类会使用这个方法，但是有一些不用使用这个方法，因此先抛出异常，
    等子类使用时在覆盖掉
    */
   public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
