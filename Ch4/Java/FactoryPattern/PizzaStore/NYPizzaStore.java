package FactoryPattern.PizzaStore;
import FactoryPattern.IngredientFactory.IngredientFactory;
import FactoryPattern.IngredientFactory.NYPizzaFactory;
import FactoryPattern.Pizza.CheesePizza;
import FactoryPattern.Pizza.ComboPizza;
import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Pizza.SeafoodPizza;
import FactoryPattern.Pizza.VeganPizza;

public class NYPizzaStore extends PizzaStore{
    
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        IngredientFactory NYFactory = new NYPizzaFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(NYFactory);
            pizza.setName("NY Cheese Pizza");
        }
        else if(item.equals("vegan")){
            pizza = new VeganPizza(NYFactory);
            pizza.setName("NY Vegan Pizza");
        }
        else if(item.equals("seafood")){
            pizza = new SeafoodPizza(NYFactory);            
            pizza.setName("NY forzen seafood Pizza :))");
        }
        else{
            pizza = new ComboPizza(NYFactory);
            pizza.setName("NY style mix favor combo pizza");
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
