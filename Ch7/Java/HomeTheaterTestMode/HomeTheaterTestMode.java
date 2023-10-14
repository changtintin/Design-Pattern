package Ch7.Java.HomeTheaterTestMode;
import Ch7.Java.HomeTheaterFacade.*;
import Ch7.Java.HomeTheaterFacade.Amplifier.Amplifier;
import Ch7.Java.HomeTheaterFacade.DvdPlayer.DvdPlayer;
import Ch7.Java.HomeTheaterFacade.PopcornPopper.PopcornPopper;
import Ch7.Java.HomeTheaterFacade.Projector.Projector;
import Ch7.Java.HomeTheaterFacade.Screen.Screen;
import Ch7.Java.HomeTheaterFacade.TheaterLights.TheaterLights;

public class HomeTheaterTestMode {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade myTheater = new HomeTheaterFacade(amp, dvdPlayer,projector, screen, lights, popper);
        myTheater.watchMovie("Fast and Furious");
    }
}
