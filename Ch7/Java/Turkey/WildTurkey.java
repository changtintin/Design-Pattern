package Ch7.Java.Turkey;

public class WildTurkey extends Turkey{
    public WildTurkey(String name){
        this.name = name;
    }

    public void gobble() {
        System.out.println(name + ": Gobble gobble"); 
    }

    public void fly() {
        System.out.println("I’m flying a short distance");
    }
}
