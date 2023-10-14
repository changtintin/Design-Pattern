package Ch7.Java.Pond;
import java.util.ArrayList;
import Ch7.Java.Duck.Duck;

public class Pond {
    ArrayList<Duck> ducks;

    public Pond(){
        ducks = new ArrayList<Duck>(5);
    }

    public void setDuck(Duck duck){
        ducks.add(duck);
    }

    public void duckGreet(){
        for(int i = 0; i < ducks.size(); i++){
            System.out.print(i + ". ");
            ducks.get(i).makeSound();
        }
    }
}
