package Ch6.Java.Command;

import Ch6.Java.Receiver.Light;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute(){        
        light.Off();
    }
}