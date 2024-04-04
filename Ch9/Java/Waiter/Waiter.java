package Ch9.Java.Waiter;

import Ch9.Java.Diner.DinerMenu;
import Ch9.Java.Iterator.DinerIterator;
import Ch9.Java.MenuItem.MenuItem;
import Ch9.Java.PancakeHouse.PancakeHouseMenu;

public class Waiter {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waiter(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu){
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }    

    public void showBreakfastMenu(){
        System.out.println("PancakeHouse Menu:");
        java.util.Iterator<MenuItem> pancakeIter = this.pancakeHouseMenu.createIterator();
        while(pancakeIter.hasNext()){
            MenuItem item = pancakeIter.next();
            String vegan =  "(X)";
            if(item.isVegetarian()){
                vegan = "(V)";
            }
            System.out.println(item.getName() + " - $" + item.getPrice() + vegan);
        }
    }

    public void showLunchMenu(){
        DinerIterator dinerIter = this.dinerMenu.createIterator();
        System.out.println("Diner Menu:");
        while(dinerIter.hasNext()){
            MenuItem item = dinerIter.next();
            String vegan =  "(X)";
            if(item.isVegetarian()){
                vegan = "(V)";
            }
            System.out.println(item.getName() + " - $" + item.getPrice() + vegan);
        }
    }

    public void showMenus(){
        System.out.println("\n< Menu >");
        showBreakfastMenu();
        System.out.println("--------------------");
        showLunchMenu();
    }

    public void showVegetarianMenus(){
        System.out.println("\n< Vegan Menu >");
        System.out.println("PancakeHouse Menu:");
        java.util.Iterator<MenuItem> pancakeIter = this.pancakeHouseMenu.createIterator();
        while(pancakeIter.hasNext()){
            MenuItem item = pancakeIter.next();
            if(item.isVegetarian()){                
                System.out.println(item.getName() + " - $" + item.getPrice());
            }        
        }
        System.out.println("--------------------");
        DinerIterator dinerIter = this.dinerMenu.createIterator();
        System.out.println("Diner Menu:");
        while(dinerIter.hasNext()){
            MenuItem item = dinerIter.next();
            if(item.isVegetarian()){                
                System.out.println(item.getName() + " - $" +item.getPrice());
            }
        }
    }
}
