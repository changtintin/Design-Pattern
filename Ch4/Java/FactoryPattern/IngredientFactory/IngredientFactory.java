package FactoryPattern.IngredientFactory;
import FactoryPattern.Ingredient.Cheese.Cheese;
import FactoryPattern.Ingredient.Dough.Dough;
import FactoryPattern.Ingredient.Sauce.Sauce;
import FactoryPattern.Ingredient.Seafood.Seafood;
import FactoryPattern.Ingredient.Veggies.Veggies;

public interface IngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Seafood createSeafood();
    public Veggies createVeggies();
}
