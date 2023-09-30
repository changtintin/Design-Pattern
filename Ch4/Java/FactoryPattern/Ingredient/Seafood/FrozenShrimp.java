package FactoryPattern.Ingredient.Seafood;

public class FrozenShrimp implements Seafood{
    protected String name;
    
    public FrozenShrimp(){
        name = "frozen shrimp";
    }

    public String getName(){
        return name;
    }
}
