package Ch7.Java.Duck;

public class MallardDuck extends Duck{
    public MallardDuck(String name){
        this.name = name;
    }

    public void fly(){
        System.out.println("I'm flying.");
    }

    public void makeSound(){        
        System.out.println(name + ": quack quack quack");
    }
}
