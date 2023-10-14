package Ch7.Java.HomeTheaterFacade.TheaterLights;

public class TheaterLights {
    public void on(){
        System.out.println("Theater Lights: on");
    }

    public void off(){
        System.out.println("Theater Lights: off");
    }

    public void dim(int num){
        System.out.println("Theater Lights: dim by " + num);
    }
}
