package FactoryPattern.Ingredient.Sauce;

public class WhiteSauce implements Sauce{
    protected String name;
    
    public WhiteSauce(){
        name = "whiteSauce";
    }

    public String getName(){
        return name;
    }
}
