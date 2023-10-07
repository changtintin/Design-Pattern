package Ch6.Java.Receiver;

public class Fridge extends Receiver{
    public Fridge(String position){
        this.position = position;
    }

    public void open(){
        System.out.println("Open the fridge door in " + position);
    }

    public void close(){
        System.out.println("Close the fridge door in " + position);
    }
}
