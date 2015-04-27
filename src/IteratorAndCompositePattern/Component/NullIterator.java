package IteratorAndCompositePattern.Component;

import java.util.Iterator;

/**
 * Created by zz on 2015/4/27.
 */
public class NullIterator implements Iterator{
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
