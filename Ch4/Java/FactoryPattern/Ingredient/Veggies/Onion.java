package FactoryPattern.Ingredient.Veggies;

public class Onion implements Veggies{
    protected String name;
    
    public Onion(){
        name = "onion";
    }

    public String getName(){
        return name;
    }
}
