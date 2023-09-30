package FactoryPattern.PizzaStore;
import FactoryPattern.IngredientFactory.ChicagoPizzaFactory;
import FactoryPattern.IngredientFactory.IngredientFactory;
import FactoryPattern.IngredientFactory.NYPizzaFactory;
import FactoryPattern.Pizza.CheesePizza;
import FactoryPattern.Pizza.ComboPizza;
import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Pizza.SeafoodPizza;
import FactoryPattern.Pizza.VeganPizza;

public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        IngredientFactory chicagoPizzaFactory = new ChicagoPizzaFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(chicagoPizzaFactory);
            pizza.setName("Chicago double Cheese Pizza");
        }
        else if(item.equals("vegan")){
            pizza = new VeganPizza(chicagoPizzaFactory);
            pizza.setName("Chicago Vegan Pizza");
        }
        else if(item.equals("seafood")){
            pizza = new SeafoodPizza(chicagoPizzaFactory);            
            pizza.setName("Chicago fresh seafood Pizza :))");
        }
        else{
            pizza = new ComboPizza(chicagoPizzaFactory);
            pizza.setName("Chicago style homemade combo pizza");
        }
        return pizza;
    }

    public void orderPizza(String item){
        Pizza pizza = createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.getName();
        System.out.println("Your order is ready! ");
    }
}
