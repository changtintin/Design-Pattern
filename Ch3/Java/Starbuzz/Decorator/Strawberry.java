package Ch3.Java.Starbuzz.Decorator;
import Ch3.Java.Starbuzz.Beverage.Beverage;
public class Strawberry extends CondimentDecorator{
    Beverage beverage;

    public Strawberry(Beverage beverage){
        this.beverage = beverage;
    }

    public String getIngredient(){
        return "Strawberry " + beverage.getIngredient();
    }

    public int cost(){
        return 75 + beverage.cost();
    }
}
