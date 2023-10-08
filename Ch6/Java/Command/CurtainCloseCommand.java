package Ch6.Java.Command;

import Ch6.Java.Receiver.Curtain;
public class CurtainCloseCommand implements Command{
    Curtain curtain;

    public CurtainCloseCommand(Curtain curtain){
        this.curtain = curtain;
    }

    public void execute(){        
        curtain.close();
    }

    public void undo(){
        curtain.open();
    }
}