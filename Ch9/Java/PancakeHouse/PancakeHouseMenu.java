package Ch9.Java.PancakeHouse;

import java.util.ArrayList;
import java.util.Iterator;
import Ch9.Java.MenuItem.*;

public class PancakeHouseMenu{
    protected ArrayList<MenuItem> menuItems;

    public void addItem(String name, String descriptions, int price, boolean vegetarian){
        MenuItem item = new MenuItem(name, descriptions, price, vegetarian);
        this.menuItems.add(item);
    }

    public PancakeHouseMenu(){
        this.menuItems = new ArrayList<MenuItem>();
        addItem("Classic Pancake Delight", "Fluffy pancakes served with maple syrup, butter, and a dusting of powdered sugar.", 180, true);
        addItem("Berry Bliss Pancakes", "Pancakes topped with a generous serving of mixed berries (strawberries, blueberries, and raspberries) and whipped cream.", 160, true);
        addItem("Morning Glory Deluxe", "Fluffy pancakes served with crispy bacon strips, scrambled eggs with chives, and a side of maple syrup.", 250, false);
        addItem("Country Classic Combo", "Buttermilk pancakes accompanied by savory sausage links, sunny-side-up eggs, and a side of homemade country gravy.", 280, false);
    }

    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }
}
