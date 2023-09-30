package FactoryPattern.Ingredient.Cheese;

public class CheddarCheese implements Cheese{
    protected String name;
    public CheddarCheese(){
        this.name = "CheddarCheese";
    }
    public String getName(){
        return this.name;
    }
}