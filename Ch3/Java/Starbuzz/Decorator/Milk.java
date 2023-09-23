package Ch3.Java.Starbuzz.Decorator;
import Ch3.Java.Starbuzz.Beverage.Beverage;
public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getIngredient(){
        return "Milk " + beverage.getIngredient();
    }

    public int cost(){
        return 30 + beverage.cost();
    }
}
