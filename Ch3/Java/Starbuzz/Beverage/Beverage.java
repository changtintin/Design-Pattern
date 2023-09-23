package Ch3.Java.Starbuzz.Beverage;

public abstract class Beverage {
    public String description;
    public String getIngredient(){
        return description;
    }
    abstract public int cost();
}
