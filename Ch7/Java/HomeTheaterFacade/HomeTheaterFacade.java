package Ch7.Java.HomeTheaterFacade;

import Ch7.Java.HomeTheaterFacade.Amplifier.Amplifier;
import Ch7.Java.HomeTheaterFacade.DvdPlayer.DvdPlayer;
import Ch7.Java.HomeTheaterFacade.Projector.Projector;
import Ch7.Java.HomeTheaterFacade.TheaterLights.TheaterLights;
import Ch7.Java.HomeTheaterFacade.Screen.Screen;
import Ch7.Java.HomeTheaterFacade.PopcornPopper.PopcornPopper;

public class HomeTheaterFacade{
    Amplifier amp;
    DvdPlayer dvd;     
    Projector projector; 
    TheaterLights lights; 
    Screen screen; 
    PopcornPopper popper;

    public HomeTheaterFacade(
        Amplifier amp, 
        DvdPlayer dvd,        
        Projector projector,
        Screen screen, 
        TheaterLights lights, 
        PopcornPopper popper) {

        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector; 
        this.screen = screen; 
        this.lights = lights; 
        this.popper = popper;
    }

    public void watchMovie(String movie){
        System.out.println("Setting up for a movie");
        popper.on();
        popper.pop();
        lights.on();
        lights.dim(20);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(41);
        dvd.on();
        dvd.play(movie);
    }
}