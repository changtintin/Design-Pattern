package FactoryPattern.Pizza;

import FactoryPattern.IngredientFactory.IngredientFactory;
import FactoryPattern.Ingredient.Cheese.Cheese;
import FactoryPattern.Ingredient.Dough.Dough;
import FactoryPattern.Ingredient.Sauce.Sauce;
import FactoryPattern.Ingredient.Seafood.Seafood;
import FactoryPattern.Ingredient.Veggies.Veggies;


public abstract class Pizza{

    //只會使用特定工廠出產的食材
    public String name;
    public Dough dough;
    public Seafood seafood;
    public Veggies veggies;
    public Sauce sauce;
    public Cheese cheese;

    //會在子類別實現不同的pizza作法
    abstract public void prepare();

    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println(this.name);
    }
 
    public void bake(){
        System.out.println("Bake for 30 mins");
    }
    
    public void cut(){
        System.out.println("Cut into 8 slices");
    }

    public void box(){
        System.out.println("Place the pizza in a proper box");        
    }
}
