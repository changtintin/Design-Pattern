package FactoryPattern.Ingredient.Cheese;

public class MozzarellaCheese implements Cheese{
    protected String name;
    public MozzarellaCheese(){
        this.name = "MozzarellaCheese";
    }
    public String getName(){
        return this.name;
    }
}