package Ch7.Java.HomeTheaterFacade.Amplifier;

public class Amplifier {
    public void on(){
        System.out.println("Amplifier: On");
    }

    public void off(){
        System.out.println("Amplifier: Off");
    }
    
    public void setDvd(){
        System.out.println("Amplifier: DVD set");
    } 


    public void setStereoSound(){
        System.out.println("Amplifier: Stereo set");
    } 

    public void setSurroundSoud(){
        System.out.println("Amplifier: Surrounded set");
    }

    public void setVolume(int volume){
        System.out.println("Amplifier: Volume set volume to "+ volume);
    }
}
