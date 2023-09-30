package FactoryPattern.Ingredient.Dough;

public class ThinDough implements Dough{
    protected String name;

    public ThinDough(){
        this.name = "Thin Dough";
    }

    public String getName(){
        return this.name;
    }
}
