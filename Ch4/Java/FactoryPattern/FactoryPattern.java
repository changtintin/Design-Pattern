package FactoryPattern;
import FactoryPattern.Pizza.*;
import FactoryPattern.IngredientFactory.*;
import FactoryPattern.PizzaStore.*;


public class FactoryPattern {
   
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("seafood");
        System.out.println("_________________________");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("seafood");
    }
}
