package FactoryPattern.Pizza;
import FactoryPattern.IngredientFactory.IngredientFactory;

public class VeganPizza extends Pizza{
    IngredientFactory factory;

    public  VeganPizza(IngredientFactory factory){
        this.factory = factory;
    }

    public void prepare(){
        System.out.println("Preparing "+ this.name);

        //用特定工廠的食材
        dough = factory.createDough();
        sauce = factory.createSauce();
        veggies = factory.createVeggies();
    }
}
