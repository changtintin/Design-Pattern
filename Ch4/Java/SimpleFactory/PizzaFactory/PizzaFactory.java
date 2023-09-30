package Ch4.Java.SimpleFactory.PizzaFactory;
import Ch4.Java.SimpleFactory.Pizza.*;

public class PizzaFactory {
    Pizza pizza;
    
    public Pizza createPizza(String orderType){
        if(orderType.equals("hawaii")){
            pizza = new Hawaii();
        }
        else if(orderType.equals("pepperoni")){
            pizza = new Pepperoni();
        }
        else{
            pizza = new Veggies();
        }
        return pizza;
    }
}
