package Ch3.Java.Starbuzz.Decorator;
import Ch3.Java.Starbuzz.Beverage.Beverage;
public class WhipCream extends CondimentDecorator{
    Beverage beverage;

    public WhipCream(Beverage beverage){
        this.beverage = beverage;
    }

    public String getIngredient(){
        return "WhipCream"+" "+beverage.getIngredient();
    }

    public int cost(){
        return 30 + beverage.cost();
    }
}
