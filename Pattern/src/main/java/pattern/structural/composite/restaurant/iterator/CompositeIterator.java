package pattern.structural.composite.restaurant.iterator;

import pattern.structural.composite.restaurant.component.Menu;
import pattern.structural.composite.restaurant.component.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class CompositeIterator implements Iterator {
    Stack stack= new Stack();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (!stack.isEmpty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }  else {
                return false;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component =  (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        else
            return null;
    }
}
