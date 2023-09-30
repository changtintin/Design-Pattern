package FactoryPattern.Ingredient.Sauce;

public class Ketchup implements Sauce{
    protected String name;
    public Ketchup(){
        name = "Ketchup";
    }

    public String getName(){
        return name;
    }
}
