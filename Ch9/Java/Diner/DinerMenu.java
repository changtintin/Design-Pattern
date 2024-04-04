package Ch9.Java.Diner;

import Ch9.Java.Iterator.*;
import Ch9.Java.MenuItem.MenuItem;

public class DinerMenu{
    public static final int MAX_ITEMS = 6;
    public int numOfItems;
    public int position;
    protected MenuItem[] menuItems;

    public void addItem(String name, String descriptions, int price, boolean vegetarian){
        if(this.numOfItems < MAX_ITEMS){
            MenuItem item = new MenuItem(name, descriptions, price, vegetarian);
            this.menuItems[numOfItems] = item;
            numOfItems ++;
        }
        else{
            System.out.println("No extra capacity now");
        }
    }

    public DinerMenu(){
        numOfItems = 0;
        position = 0;
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Green Delight Set","Mixed greens, avocado, cucumber, tomato, feta", 150, true);
        addItem("Savory Feast Set", "Grilled chicken, mashed potatoes, steamed broccoli", 180, false);
        addItem("Mediterranean Bliss Set", "Hummus, falafel, tabbouleh, pita bread", 160, true);
        addItem("Asian Fusion Set", "Teriyaki tofu, stir-fried vegetables, rice", 170, true);
    }

    // public MenuItem[] getMenuItems(){
    //     return this.menuItems;
    // }
    
    public DinerIterator createIterator(){
        return new DinerIterator(menuItems, numOfItems);
    }

    public boolean hasNext(){
        if(this.position < numOfItems || this.menuItems[position] != null){
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
