package Ch9.Java.NewRestaurant;

import Ch9.Java.Diner.*;
import Ch9.Java.PancakeHouse.*;
import Ch9.Java.Waiter.Waiter;

public class NewRestaurant {
    public static void main(String arg[]){
        PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();       
        DinerMenu dinerMenu = new DinerMenu();
        Waiter Amy = new Waiter(dinerMenu, pancakeMenu);
        Amy.showMenus();
        Amy.showVegetarianMenus();
    }   
}
