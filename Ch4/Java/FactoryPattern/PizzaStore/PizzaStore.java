package FactoryPattern.PizzaStore;
import FactoryPattern.Pizza.*;


public abstract class PizzaStore {
   abstract protected Pizza createPizza(String item);
   abstract public void orderPizza(String item);
}
