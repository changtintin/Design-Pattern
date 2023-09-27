package Ch4.Java.SimpleFactory.PizzaStore;
import Ch4.Java.SimpleFactory.Pizza.*;
import Ch4.Java.SimpleFactory.PizzaFactory.PizzaFactory;


public class PizzaStore {
    PizzaFactory pizzaFactory;
    public PizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }
    public Pizza orderPizza(String orderType){        
        Pizza pizza = pizzaFactory.createPizza(orderType);

        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
