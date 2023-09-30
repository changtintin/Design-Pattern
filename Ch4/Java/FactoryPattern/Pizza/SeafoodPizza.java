package FactoryPattern.Pizza;
import FactoryPattern.IngredientFactory.IngredientFactory;

public class SeafoodPizza extends Pizza{
    IngredientFactory factory;

    public SeafoodPizza(IngredientFactory factory){
        this.factory = factory;
    }

    public void prepare(){
        System.out.println("Preparing "+ this.name);

        //用特定工廠的食材        
        dough = factory.createDough();
        sauce = factory.createSauce();        
        seafood = factory.createSeafood();

        System.out.println("Ingredients: "+dough.getName() + "/ "+sauce.getName()+"/ "+seafood.getName());
    }
}

