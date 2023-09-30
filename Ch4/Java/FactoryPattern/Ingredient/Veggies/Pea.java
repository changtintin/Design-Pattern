package FactoryPattern.Ingredient.Veggies;

public class Pea implements Veggies{
    protected String name;
    
    public Pea(){
        name = "peas";
    }

    public String getName(){
        return name;
    }
}
