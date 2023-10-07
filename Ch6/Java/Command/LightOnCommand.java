package Ch6.Java.Command;

import Ch6.Java.Receiver.Light;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){        
        light.On();
    }
}