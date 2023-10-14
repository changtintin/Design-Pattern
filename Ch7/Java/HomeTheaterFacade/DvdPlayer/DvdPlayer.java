package Ch7.Java.HomeTheaterFacade.DvdPlayer;

public class DvdPlayer {
    public void on(){
       System.out.println("DVD Player: On"); 
    }

    public void off(){
        System.out.println("DVD Player: Off"); 
    }

    public void eject(){
        System.out.println("DVD Player: eject"); 
    }

    public void pause(){
        System.out.println("DVD Player: Pause"); 
    }

    public void play(String movie){
        System.out.println("DVD Player: Now is playing '" + movie + "'"); 
    }

    public void setSurroundAudio(){
        System.out.println("DVD Player: Surround audio set"); 
    }

    public void stop(){
        System.out.println("DVD Player: Stop"); 
    }
}
