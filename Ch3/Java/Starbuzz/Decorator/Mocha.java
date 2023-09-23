package Ch3.Java.Starbuzz.Decorator;
import Ch3.Java.Starbuzz.Beverage.Beverage;
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getIngredient(){
        return "Mocha " + beverage.getIngredient();
    }

    public int cost(){
        return 60 + beverage.cost();
    }
}
