package Ch9.Java.Iterator;

import Ch9.Java.MenuItem.MenuItem;

public class DinerIterator implements Iterator{
    protected MenuItem menuItems[];
    protected int position;
    protected int numOfItems;
    public DinerIterator(MenuItem []menuItems, int numOfItems){
        this.menuItems = menuItems; 
        this.numOfItems = numOfItems;
        position = 0;
    }
    
    public boolean hasNext(){
        if(position < numOfItems || menuItems[position] != null){
            return true;
        }
        return false;
    }

    public MenuItem next(){
        MenuItem nextItem = this.menuItems[position];
        position ++;
        return nextItem;
    }
}
