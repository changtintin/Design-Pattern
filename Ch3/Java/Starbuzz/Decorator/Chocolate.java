package Ch3.Java.Starbuzz.Decorator;
import Ch3.Java.Starbuzz.Beverage.Beverage;

public class Chocolate extends CondimentDecorator{
    Beverage beverage;

    public Chocolate(Beverage beverage){
        this.beverage = beverage;
    }

    public String getIngredient(){
        return "Chocolate " + beverage.getIngredient();
    }

    public int cost(){
        return 40 + beverage.cost();
    }
}
