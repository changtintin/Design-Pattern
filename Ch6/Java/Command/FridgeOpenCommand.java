package Ch6.Java.Command;

import Ch6.Java.Receiver.Fridge;
public class FridgeOpenCommand implements Command{
    Fridge fridge;

    public FridgeOpenCommand(Fridge fridge){
        this.fridge = fridge;
    }

    public void execute(){        
        fridge.open();
    }

    public void undo(){
        fridge.close();
    }
}