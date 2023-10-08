package Ch6.Java.Command;

import Ch6.Java.Receiver.Curtain;
public class CurtainOpenCommand implements Command{
    Curtain curtain;

    public CurtainOpenCommand(Curtain curtain){
        this.curtain = curtain;
    }

    public void execute(){        
        curtain.open();
    }

    public void undo(){
        curtain.close();
    }
}