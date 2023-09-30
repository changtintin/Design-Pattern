package FactoryPattern.IngredientFactory;

import FactoryPattern.Ingredient.Cheese.Cheese;
import FactoryPattern.Ingredient.Cheese.MozzarellaCheese;
import FactoryPattern.Ingredient.Dough.Dough;
import FactoryPattern.Ingredient.Dough.ThickDough;
import FactoryPattern.Ingredient.Sauce.Ketchup;
import FactoryPattern.Ingredient.Sauce.Sauce;
import FactoryPattern.Ingredient.Seafood.Clam;
import FactoryPattern.Ingredient.Seafood.Seafood;
import FactoryPattern.Ingredient.Veggies.Onion;
import FactoryPattern.Ingredient.Veggies.Veggies;

public class ChicagoPizzaFactory implements IngredientFactory{
    public Dough createDough(){
        Dough dough = new ThickDough();       
        return dough;
    }

    public Sauce createSauce(){
        Sauce sauce = new Ketchup();
        return sauce;
    }

    public Cheese createCheese(){
        Cheese cheese = new MozzarellaCheese();       
        return cheese;
    }

    public Seafood createSeafood(){
        Seafood clam = new Clam();
        return clam;
    }
    
    public Veggies createVeggies() {
        Veggies onion = new Onion();
        return onion;
    }
}
