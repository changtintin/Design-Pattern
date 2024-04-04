package Ch9.Java.MenuItem;

public class MenuItem{
    protected String name;
    protected String descriptions;
    protected int price;
    protected boolean vegetarian;

    public MenuItem(String name, String descriptions, int price, boolean vegetarian){
        this.name = name;
        this.descriptions = descriptions;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.descriptions;
    }

    public int getPrice(){
        return this.price;
    }

    public boolean isVegetarian(){
        return this.vegetarian;
    }
}
