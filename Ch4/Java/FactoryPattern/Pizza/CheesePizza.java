package FactoryPattern.Pizza;
import FactoryPattern.IngredientFactory.IngredientFactory;

public class CheesePizza extends Pizza{
    IngredientFactory factory;

    public  CheesePizza(IngredientFactory factory){
        this.factory = factory;
    }

    public void prepare(){
        System.out.println("Preparing "+ this.name);

        //用特定工廠的食材
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}
