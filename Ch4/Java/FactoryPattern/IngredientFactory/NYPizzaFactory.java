package FactoryPattern.IngredientFactory;

import FactoryPattern.Ingredient.Cheese.CheddarCheese;
import FactoryPattern.Ingredient.Cheese.Cheese;
import FactoryPattern.Ingredient.Dough.Dough;
import FactoryPattern.Ingredient.Dough.ThinDough;
import FactoryPattern.Ingredient.Sauce.Sauce;
import FactoryPattern.Ingredient.Sauce.WhiteSauce;
import FactoryPattern.Ingredient.Seafood.FrozenShrimp;
import FactoryPattern.Ingredient.Seafood.Seafood;
import FactoryPattern.Ingredient.Veggies.Pea;
import FactoryPattern.Ingredient.Veggies.Veggies;

public class NYPizzaFactory implements IngredientFactory{
    public Dough createDough(){
        Dough dough = new ThinDough();
        return dough;
    }
    public Sauce createSauce(){
        Sauce sauce = new WhiteSauce();
        return sauce;
    }
    public Cheese createCheese(){
        Cheese cheese = new CheddarCheese();
        return cheese;
    }
    public Seafood createSeafood(){
        Seafood shrimp = new FrozenShrimp();
        return shrimp;
    }
    public Veggies createVeggies() {
        Veggies onion = new Pea();
        return onion;
    }
}
