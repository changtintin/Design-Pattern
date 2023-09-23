package Ch3.Java.Starbuzz;
import Ch3.Java.Starbuzz.Beverage.*;
import Ch3.Java.Starbuzz.Decorator.*;

public class orderSystem {
    public static void main(String arg[]){
        Beverage firstDrink = new Latte();
        firstDrink = new WhipCream(firstDrink);
        firstDrink = new Chocolate(firstDrink);
        System.out.printf(firstDrink.getIngredient());
        System.out.println(": TWD$ "+firstDrink.cost());

        Beverage secDrink = new DarkRoast();
        secDrink = new Mocha(secDrink);
        secDrink = new Strawberry(secDrink);
        secDrink = new Milk(secDrink);

        System.out.printf(secDrink.getIngredient());
        System.out.println(": TWD$ "+secDrink.cost());
    }
}
