package Ch4.Java.SimpleFactory.Pizza;

public class Pizza{
    public String pizzaName;    

    public void bake(){
        System.out.println("It's been baking.");
    }
    
    public void cut(){
        System.out.println("It's been cutting.");
    }

    public void box(){
        System.out.println("It's been boxing.");
        System.out.println("Here is your order: " + pizzaName);
    }
}