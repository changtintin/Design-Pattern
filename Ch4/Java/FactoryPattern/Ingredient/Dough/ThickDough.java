package FactoryPattern.Ingredient.Dough;

public class ThickDough implements Dough{
    protected String name;

    public ThickDough(){
        this.name = "Thick Dough";
    }
    
    public String getName(){
        return this.name;
    }
}
