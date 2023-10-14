package Ch7.Java.DuckSimulator;

import Ch7.Java.Duck.*;
import Ch7.Java.DuckAdapter.*;
import Ch7.Java.Pond.Pond;
import Ch7.Java.Turkey.WildTurkey;

public class DuckSimulator {
   
    public static void main(String[] args) {
        Duck Felix = new MallardDuck("Felix");
        Duck Larry = new MallardDuck("Larry");
        Pond duckPond = new Pond();

        DuckAdapter Roger = new DuckAdapter(new WildTurkey("Roger"));
        duckPond.setDuck(Felix);
        duckPond.setDuck(Larry);
        duckPond.setDuck(Roger);
        duckPond.duckGreet();
    }
}
