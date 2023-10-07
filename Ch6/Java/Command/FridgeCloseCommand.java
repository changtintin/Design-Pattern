package Ch6.Java.Command;

import Ch6.Java.Receiver.Fridge;
public class FridgeCloseCommand implements Command{
    Fridge fridge;

    public FridgeCloseCommand(Fridge fridge){
        this.fridge = fridge;
    }
 
    public void execute(){        
        fridge.close();
    }
}