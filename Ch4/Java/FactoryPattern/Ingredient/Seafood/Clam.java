package FactoryPattern.Ingredient.Seafood;

public class Clam implements Seafood{
    protected String name;
    
    public Clam(){
        name = "Clam";
    }

    public String getName(){
        return name;
    }
}
