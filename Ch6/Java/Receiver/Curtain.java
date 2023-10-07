package Ch6.Java.Receiver;

public class Curtain extends Receiver{
    public Curtain(String position){
        this.position = position;
    }

    public void open(){
        System.out.println(" Make curtain open in " + position);
    }

    public void close(){
        System.out.println("Make curtain close in " + position);
    }
}
