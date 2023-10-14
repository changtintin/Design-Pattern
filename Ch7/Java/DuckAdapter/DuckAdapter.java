package Ch7.Java.DuckAdapter;
import Ch7.Java.Turkey.*;
import Ch7.Java.Duck.*;

public class DuckAdapter extends Duck{
    public Turkey turkey;

    public DuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void makeSound(){
        turkey.gobble();
    }

    public void fly(){
        turkey.fly();
    }
}
