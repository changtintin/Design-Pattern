package Ch4.Java.SimpleFactory;
import Ch4.Java.SimpleFactory.PizzaFactory.PizzaFactory;
import Ch4.Java.SimpleFactory.PizzaStore.PizzaStore;


public class SimpleFactory {
   
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore firstBranch = new PizzaStore(factory);
        firstBranch.orderPizza("hawaii");
        firstBranch.orderPizza("seafood");
    }
}
