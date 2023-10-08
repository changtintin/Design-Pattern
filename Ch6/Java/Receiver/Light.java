package Ch6.Java.Receiver;

import Ch6.Java.Command.Command;

public class Light extends Receiver{
    public Light(String position){
        this.position = position;
    }
    public void on(){
        System.out.println("Turn on the light in " + position );
    }

    public void off(){
        System.out.println("Turn off the light in " + position );
    }   
}
